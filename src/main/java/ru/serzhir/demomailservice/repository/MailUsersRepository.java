package ru.serzhir.demomailservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.serzhir.demomailservice.entity.MailUser;

public interface MailUsersRepository extends JpaRepository<MailUser, Integer> {
}