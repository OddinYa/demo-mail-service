package ru.serzhir.demomailservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.serzhir.demomailservice.dao.UsersDAO;


@Controller
@RequestMapping("/employeers")
public class Employeers {

    private final UsersDAO usersDAO;

    @Autowired
    public Employeers(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    @GetMapping("/")
    public String getEmployeers(){

        return "index";
    }
}
