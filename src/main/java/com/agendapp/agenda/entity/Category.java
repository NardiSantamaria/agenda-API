package com.agendapp.agenda.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_category;
    private String name_category;

}
