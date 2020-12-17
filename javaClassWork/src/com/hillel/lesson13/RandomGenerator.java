package com.hillel.lesson13;

import org.apache.commons.lang3.StringUtils;

public class RandomGenerator {

    public int getIntValue(int maxValue){
        return (int) (Math.random()*maxValue);
    }

    public String getStringValue(int numberOfChar){
        return null;
    }
}
