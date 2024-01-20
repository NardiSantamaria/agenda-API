package com.agendapp.agenda.entity;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Task {
    private enum Type{
        urgent,
        scheduled,
        freeTime
    }
    private enum Status{
        finished,
        pending,
        unstarted
    }
    private enum Category{
        finances,
        fun,
        work,
        studyTime,
        gardening
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="task_id")
    private int id;
    private LocalDate date;
    private LocalTime time;
    @Column(name="task_type")
    @Enumerated(value=EnumType.STRING)
    private Type type;
    @Column(name="task_status")
    private Status status;
    @Column(name="task_category")
    private Category category;

}
