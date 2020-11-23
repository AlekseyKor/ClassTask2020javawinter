package com.hillel.lesson6;

public class CloneTest implements Cloneable{

    Integer i = 0;

    public CloneTest(Integer i){}


    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("run clone method");
        return super.clone();
    }
}
