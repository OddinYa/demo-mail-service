package ru.serzhir.demomailservice.service;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class PasswordFormation {

    public String getRandomPassword() {
        List<Integer> password;

        password = new Random().ints(16, 33, 126).boxed().collect(Collectors.toList());

        return password.stream().map(Character::toChars).collect(StringBuilder::new
                ,StringBuilder::append
                ,StringBuilder::append).toString();


    }
}