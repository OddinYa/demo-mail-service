package ru.serzhir.demomailservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MailUser {
    @Id
    private User id_password;

    private String mail;

    private String password;

}
