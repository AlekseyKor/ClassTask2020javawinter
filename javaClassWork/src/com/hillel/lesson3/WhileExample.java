package com.hillel.lesson3;

public class WhileExample {
    public static void main(String[] args) {

        byte a = 10;
        byte result = 0;

        while (a <= 100){
            result += a--;
            System.out.println("a > " + a + ", result > " + result);
        }
    }
}
