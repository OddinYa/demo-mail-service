package ru.serzhir.demomailservice.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "mail_box")
public class MailBox {

    @Id
    @Column(name = "id_user", nullable = false)
    @OneToOne
    private Integer id_mail_box;

    private int size;

    private boolean visibility;

    private String alternativeMail;



}
