package com.agendapp.agenda.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
@Entity
@Table(name="status")
public class Status {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_status")
    private int id_status;
    private String status_name;

    public int getIdStatus(){
        return this.id_status;
    }
    public String getStatus(){
        return this.status_name;
    }
}
