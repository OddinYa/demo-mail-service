package ru.serzhir.demomailservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MailUser {
    @Id
    @OneToOne
    private User user_id;

    private String mail;

    private String password;

}
