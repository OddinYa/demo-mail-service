package ru.serzhir.demomailservice.service;

import org.springframework.stereotype.Service;
import ru.serzhir.demomailservice.entity.User;
@Service
public class MailFormation {

    public String getMailForUser(User user){
        return user.getFirstName() + "." + user.getSecondName() + "@" + user.getDepartment() + "."
                + user.getCompany();
    }
}
