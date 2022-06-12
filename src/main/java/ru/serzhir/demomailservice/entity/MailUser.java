package ru.serzhir.demomailservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "mail_user")
public class MailUser {
    @Id
    private long id_password;

    private String mail;

    private String password;

}
