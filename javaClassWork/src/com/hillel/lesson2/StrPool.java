package com.hillel.lesson2;

public class StrPool {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";
        String str3 = new String("Cat");
        str3 = str3.intern();

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
