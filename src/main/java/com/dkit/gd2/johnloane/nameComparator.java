package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class nameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
