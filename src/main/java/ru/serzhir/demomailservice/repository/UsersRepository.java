package ru.serzhir.demomailservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.serzhir.demomailservice.entity.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
}