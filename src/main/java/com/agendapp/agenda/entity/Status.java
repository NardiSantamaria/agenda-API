package com.agendapp.agenda.entity;
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
    private int id_status;
    private String status_name;
}
