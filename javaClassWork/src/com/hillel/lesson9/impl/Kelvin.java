package com.hillel.lesson9.impl;

public class Kelvin implements BaseConverter{
    @Override
    public int convert(int value) {
        return value + 273;
    }
}
