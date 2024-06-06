package com.agendapp.agenda.entity;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_task")
    private int id_task;
    private String tittle;
    private String description;
    private LocalDate schedule_date;
    private LocalDate started_date;
    private LocalDate finished_date;
    private LocalTime schedule_time;
    private LocalTime started_time;
    private LocalTime finished_time;
    private int id_type;
    private int id_status;
    private int id_category;

    public int getIdTask(){
        return this.id_task;
    }
    public String getTittle(){
        return this.tittle;
    }
    public String getDescription(){
        return this.description;
    }
    public LocalDate getScheduledDate(){
        return this.schedule_date;
    }
    public LocalDate getStartedDate(){
        return this.started_date;
    }
    public LocalDate getFinishedDate(){
        return this.finished_date;
    }
    public LocalTime getScheduledTime(){
        return this.schedule_time;
    }
    public LocalTime getStartedTime(){
        return this.started_time;
    }
    public LocalTime getFinishedTime(){
        return this.finished_time;
    }
    public int getIdType(){
        return this.id_type;
    }
    public int getIdStatus(){
        return this.id_status;
    }
    public int getIdCategory(){
        return this.id_category;
    }
}
