package com.hillel.lesson3;

public class ClassWork {
    public static void main(String[] args) {
        /*int i = 22213;

        String val = String.valueOf(i);

        char[] chars = val.toCharArray();

        int sumCh = 0;
        int sumNe = 0;
        for (char c : chars){
            int in = Integer.valueOf(String.valueOf(c));
            if (in % 2 == 0) sumCh +=in;
            if(in % 2 != 0) sumNe +=in;
        }
        System.out.println(sumCh);
        System.out.println(sumNe);


        String[] split = ("2" +
                "222").split("");
        for(String s : split){
            System.out.println(s);
        }*/

        // реверс

        /*int number = 1234;

        String str = String.valueOf(number);

        StringBuilder sb = new StringBuilder(str).reverse();
        int i = Integer.valueOf(sb.toString());
        System.out.println(i);*/
        //System.out.println(Integer.valueOf(sb.toString()));

        // удалить цифру из числа

        int rem = 2;
        int num = 1212121;

        String[] split = String.valueOf(num).split("");

        StringBuilder result = new StringBuilder();
        for (String s : split){
            if (Integer.parseInt(s) != 2){
                result.append(s);
            }
        }
        System.out.println(result);

        //удалить первую и последнюю цифры

        int nu = 123456789;
        String n = String.valueOf(nu);
        System.out.println(n);
        System.out.println(Integer.parseInt(n.substring(0,1)) + Integer.parseInt(n.substring(n.length()-1)));
        System.out.println();




    }
}
