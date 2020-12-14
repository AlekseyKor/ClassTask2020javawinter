package com.hillel.lesson12.validator;

public class Main {
    public static void main(String[] args) throws EmailException, AgeException {

        try{
            new UserValidator().validate(new User("", 21, "Alabama"));
        } catch (AgeException | EmailException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
