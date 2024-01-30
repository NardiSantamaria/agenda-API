package com.agendapp.agenda.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
@Entity
@Table(name="task_category")
public class Status {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_status;
    private String category_name;
}
