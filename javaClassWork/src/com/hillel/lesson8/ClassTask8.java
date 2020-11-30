package com.hillel.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassTask8 {
    public static void main(String[] args) {

        ArrayList<java.io.Serializable> list = new ArrayList<>();

        String a = "aditional";

        list.add(a);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add('d');


        System.out.println(list);

        List<String> array = new ArrayList<>();
        List<String> linked = new LinkedList<>();

        int start = 10;
        int count = 0;
        int iter = 10;

        while (count < iter){
            System.out.println(start);
            int first = start;
            int next = start + (start >> 1);
            double div = next / first;
            start = next;
            System.out.println(div);
            count++;
        }



    }
}
