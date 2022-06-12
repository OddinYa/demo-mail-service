package ru.serzhir.demomailservice.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "mails")
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mail", nullable = false)
    private long mail_id;

    @JsonIgnoreProperties("mails")
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="mail_user",
            joinColumns =  @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "mail_id"))
    private List<User> users;

    private String topic;

    private String text;




}
