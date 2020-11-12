package com.hillel.lesson3;

public class WhileCounterExample {
    public static void main(String[] args) {

        String pass = "wrong";

        boolean result = false;
        int counter = 0;

        do {
            if (pass.equals("1111")) {
                result = true;
            }
            counter++;
            System.out.println(pass + " : " + result);
        } while (!result && counter < 5);
    }
}
