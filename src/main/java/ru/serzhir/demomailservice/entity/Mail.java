package ru.serzhir.demomailservice.entity;


import lombok.Data;




import javax.persistence.*;
@Data
@Entity
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mail", nullable = false)

    @ManyToMany
    private Long id;

    @ManyToOne
    private Long idMailBox;

    private String topic;

    private String text;




}
