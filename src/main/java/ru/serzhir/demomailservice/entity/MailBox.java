package ru.serzhir.demomailservice.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "mail_box")
public class MailBox {

    @Id
    private Long id_mail_box;

    private int size;

    private boolean visibility;

    private String alternativeMail;

    @OneToOne
    @MapsId
    @JoinColumn(name="user_id")
    private User user;



}
