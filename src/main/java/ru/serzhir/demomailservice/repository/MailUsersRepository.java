package ru.serzhir.demomailservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serzhir.demomailservice.entity.MailUser;

@Repository
public interface MailUsersRepository extends JpaRepository<MailUser, Integer> {
}