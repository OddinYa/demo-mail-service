package ru.serzhir.demomailservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Table(name = "Users")
@Entity
@Data
@Getter

public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    private int user_id;

    @Column(name = "firstname",nullable = false)
    private String firstName;

    @Column(name = "secondname",nullable = false)
    private String secondName;

    @Column(name = "company",nullable = false)
    private String company;

    @Column(name = "department",nullable = false)
    private String department;

    @Transient
    @JsonIgnoreProperties("users")
    @ManyToMany(mappedBy = "users")
    private List<Mail> mails;

    @OneToOne
    @JoinColumn(name = "id_mail_box")
    private Mail mail;


}