package com.chat.app.authorisation.repository;

//import org.apache.catalina.User;
import com.chat.app.authorisation.entity.User;
import org.springframework.data.repository.CrudRepository;


import java.util.UUID;

public interface AuthorisationRepository extends CrudRepository<User, UUID> {
    User findByEmail(String email);
    User findByLogin(String login);
}
