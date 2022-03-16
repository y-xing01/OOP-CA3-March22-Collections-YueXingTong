package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class ageComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
