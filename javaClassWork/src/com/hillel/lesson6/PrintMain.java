package com.hillel.lesson6;

import java.util.Comparator;

public class PrintMain {
    public static void main(String[] args) {
        new A().getAndPrintClassName();

        new B().compare2values(12, 12);


    }

    static class A{
        String getAndPrintClassName(){

            class Prnt implements PrintInfo{

                @Override
                public void print(String message) {
                    System.out.println("print message: " + message);
                }
            }
            new Prnt().print(getClass().getName());
            return "";
        }

    }

    static class B{

        Integer compare2values(Integer o1, Integer o2){
            class Comp implements Comparator<Integer> {

                @Override
                public int compare(Integer o1, Integer o2) {

                    if(o1 > o2) return -1;
                    if(o1.equals(o2)) return 0;
                    return 1;
                }
            }

            return new Comp().compare(o1, o2);


        }

    }
}
