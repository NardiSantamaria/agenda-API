package com.agendapp.agenda.entity;
import java.time.LocalDateTime;

import com.agendapp.agenda.controller.CatInterface;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task")
public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_task")
    private int id_task;
    private String task_tittle;
    private LocalDateTime started_datetime;
    private LocalDateTime finished_datetime;
    private int id_item_status;
    private int id_category;
    private String task_description;
    private LocalDateTime task_scheduledDateTime;

    public LocalDateTime getTaskScheduledDateTime() {
        return this.task_scheduledDateTime;
    }

    public void setTaskScheduledDateTime(LocalDateTime scheduledDateTime) {
        this.task_scheduledDateTime = scheduledDateTime;
    }

    public String getTaskDescription() {
        return this.task_description;
    }

    public void setTaskDescription(String task_description) {
        this.task_description = task_description;
    }

    public Task(){
        CatInterface lamda = str -> {return str.equals("Miau");};
        System.out.println(lamda.esMaullido("Miau"));
        System.out.println("creaste un objeto Task");
    }
    public int getIdTask(){
        return this.id_task;
    }
    public LocalDateTime getStartedDate(){
        return this.started_datetime;
    }
    public LocalDateTime getFinishedDate(){
        return this.finished_datetime;
    }
    public int getIdStatus(){
        return this.id_item_status;
    }
    public int getIdCategory(){
        return this.id_category;
    }
    public String getTaskTittle(){
        return this.task_tittle;
    }
    public void setTaskTittle(String task_tittle){
        this.task_tittle=task_tittle;
    }
    public void setIdTask(int id_task){
        this.id_task=id_task;
    }
    public void setIdStatus(int id_status){
        this.id_item_status=id_status;
    }

    
}
