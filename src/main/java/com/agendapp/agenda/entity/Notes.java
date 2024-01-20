package com.agendapp.agenda.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Notes {
    @Id
    private int id;
    private String tittle;
    @Column(name="image_path")
    private String imgPath;

}
