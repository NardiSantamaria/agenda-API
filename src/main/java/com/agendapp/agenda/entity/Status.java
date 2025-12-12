package com.agendapp.agenda.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
@Entity
@Table(name="item_status")
public class Status {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_item_status")
    private int id_item_status;
    private String item_status_name;

    public int getIdStatus(){
        return this.id_item_status;
    }
    public String getStatus(){
        return this.item_status_name;
    }
}
