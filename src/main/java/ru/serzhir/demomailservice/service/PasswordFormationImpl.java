package ru.serzhir.demomailservice.service;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class PasswordFormationImpl implements RandomPassword,SwitchPassword {

   private final List<Integer> generatorPassword = new Random().ints(16, 33, 126).boxed().collect(Collectors.toList());

   private String password;

    @Override
    public String getRandomPassword() {
        password = generatorPassword.stream().map(Character::toChars).collect(StringBuilder::new
                ,StringBuilder::append
                ,StringBuilder::append).toString();

        return password;
    }

    @Override
    public String switchPassword(String newPassword) {
        return this.password = newPassword;
    }
}