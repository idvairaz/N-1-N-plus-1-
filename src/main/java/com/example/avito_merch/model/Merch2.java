package com.example.avito_merch.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "merch2")
public class Merch2 {

    @Id
    @Column(name = "merch2_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

}

