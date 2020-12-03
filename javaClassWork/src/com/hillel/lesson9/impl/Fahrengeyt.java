package com.hillel.lesson9.impl;

public class Fahrengeyt implements BaseConverter{
    @Override
    public int convert(int value) {
        return (int) ((value * 1.8 ) + 32);
    }
}
