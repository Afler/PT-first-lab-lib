package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestJarClass {

    public static void main(String[] args) {
    }

    public static int calculate(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size();
    }
}
