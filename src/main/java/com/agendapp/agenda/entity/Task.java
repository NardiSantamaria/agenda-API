package com.agendapp.agenda.entity;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Task extends Registry{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_task")
    private int id_task;
    private LocalDateTime started_datetime;
    private LocalDateTime finished_datetime;
    private int id_status;
    private int id_category;

    public Task(){
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
        return this.id_status;
    }
    public int getIdCategory(){
        return this.id_category;
    }
    public void setIdTask(int id_task){
        this.id_task=id_task;
    }
    public void setIdStatus(int id_status){
        this.id_status=id_status;
    }
    
}
