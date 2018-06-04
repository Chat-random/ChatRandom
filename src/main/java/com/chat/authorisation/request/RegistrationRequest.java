package com.chat.authorisation.request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequest {
    private String login;
    private String password;
    private String email;
    private String name;
    private String surname;
    private int age;
    private String city;
    private String country;
}