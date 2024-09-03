package com.agendapp.agenda.entity;
import java.time.LocalDateTime;

import jakarta.persistence.MappedSuperclass;
@MappedSuperclass
public abstract class Registry {
    private String tittle;
    private String description;
    private int id_type;
    private LocalDateTime schedule_datetime;

    public String getTittle(){
        return this.tittle;
    }
    public String getDescription(){
        return this.description;
    }
    public int getIdType(){
        return this.id_type;
    }
    public LocalDateTime getScheduledDateTime(){
        return this.schedule_datetime;
    }
    public void setTittle(String tittle){
        this.tittle=tittle;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setIdType(int id_type){
        this.id_type=id_type;
    }
    public void setScheduledDateTime(LocalDateTime dateTime){
        this.schedule_datetime=dateTime;
    }

}
