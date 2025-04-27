package com.example.avito_merch.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee2")
@Data
public class Employee2 {
    @Id
    @Column(name = "employee2_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;


@OneToMany
@JoinColumn(name = "employee2_id")
private List<Merch2> merchList = new ArrayList<>();
}


