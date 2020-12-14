package com.hillel.lesson12.validator;

public class UserValidator {

    void validate (User user) throws EmailException, AgeException {
        if (!user.getEmail().contains("@")){
            throw new EmailException("email not valid");
        }

        if (user.getAge() < 18){
            throw new AgeException("Age is not valid");
        }

        if (user.getCountry().toLowerCase().equals("ukraine")){
            throw new RuntimeException();
        }
    }
}
