package com.agendapp.agenda.entity;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_task")
    private int id;
    private String description;
    private String tittle;
    private LocalDate schedule_date;
    private LocalDate started_date;
    private LocalDate finished_date;
    private LocalTime schedule_time;
    private LocalTime started_time;
    private LocalTime finished_time;
    private int id_type;
    private int id_status;
    private int id_category;
}
