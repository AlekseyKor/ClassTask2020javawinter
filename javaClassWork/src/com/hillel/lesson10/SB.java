package com.hillel.lesson10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Test SB");
        //StringBuilder b1 = "Test";

        System.out.println(sb);

        sb.append(" str");

        String str = "ssss";

        str = str + "sss";

        System.out.println(sb.reverse().reverse());

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'R');
        System.out.println(sb);
        System.out.println(sb.substring(1, 4));

        String s = sb.toString();
        System.out.println(s);

        StringBuilder sbb = new StringBuilder();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm");

        sbb.append(simpleDateFormat.format(new Date())).append(" >>> ");

        /*if (args[0].equals("1")){
            sbb.append("1");
        }else {
            sbb.append("2");
        }*/

        System.out.println(sbb);
    }
}
