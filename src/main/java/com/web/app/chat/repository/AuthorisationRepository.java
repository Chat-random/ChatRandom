package com.web.app.chat.repository;

import org.springframework.data.repository.CrudRepository;
import com.web.app.chat.entity.User;

import java.util.UUID;

public interface AuthorisationRepository extends CrudRepository<User, UUID> {
    User findByEmail(String email);
    User findByLogin(String login);
}
