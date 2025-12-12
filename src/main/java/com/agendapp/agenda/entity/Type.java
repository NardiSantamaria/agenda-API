package com.agendapp.agenda.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="item_type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_item_type;
    private String item_type_name;
}
