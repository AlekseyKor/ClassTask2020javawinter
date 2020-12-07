package com.hillel.lesson10;

import java.util.Objects;

public class UserSet {
    public static void main(String[] args) {



    }

}

final class UserH {
    Integer age;
    String name;
    String surname;

    public UserH(Integer age, String name, String surname){
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserH userH = (UserH) o;
        return Objects.equals(name, userH.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "UserH{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
