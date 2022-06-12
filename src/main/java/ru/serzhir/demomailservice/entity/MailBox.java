package ru.serzhir.demomailservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Data
@Entity
public class MailBox {
    @Id
    @Column(name = "id_user", nullable = false)
    @OneToOne
    private Integer id_user;

    private int size;

    private boolean visibility;

    private String alternativeMail;



}
