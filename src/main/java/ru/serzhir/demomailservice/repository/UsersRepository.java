package ru.serzhir.demomailservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serzhir.demomailservice.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}