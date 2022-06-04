package ru.serzhir.demomailservice.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "Users")
@Entity
@Data


public class Users {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "firstname",nullable = false)
    private String firstName;

    @Column(name = "secondname",nullable = false)
    private String secondName;

    @Column(name = "company",nullable = false)
    private String company;

    @Column(name = "department",nullable = false)
    private String department;

}