package com.hillel.lesson6;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest ct = new CloneTest(12);

        CloneTest c = (CloneTest) ct.clone();

        CloneTest c1 = ct;

        System.out.println(ct);
        System.out.println(c);
        System.out.println();
    }
}
