package com.hillel.lesson4;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор (простой) Вводите данные:");



    }
    public static void plus (int a, int b){
        int res = a + b;
        System.out.println(res);
    }
    public static void minus(int a, int b){
        int res = a - b;
        System.out.println(res);
    }
    public static void multiple(int a, int b){
        int res = a * b;
        System.out.println(res);
    }
    public static void division(int a, int b){
        int res = a / b;
        System.out.println(res);
    }
}
