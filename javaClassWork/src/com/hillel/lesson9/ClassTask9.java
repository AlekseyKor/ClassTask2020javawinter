package com.hillel.lesson9;

import java.util.ArrayList;
import java.util.LinkedList;

public class ClassTask9 {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<String>();
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);
        str1.add(null);

        //System.out.println(str1);

        LinkedList<String> ll1 = new LinkedList<String>();

        ll1.addFirst("1");
        ll1.addLast("0");

        ll1.add("hi1");
        ll1.add("hi2");
        ll1.add("hi3");
        ll1.add("hi4");
        ll1.add("hi5");

        ll1.add(1, "gi-gi");

        System.out.println(ll1);

    }
}
