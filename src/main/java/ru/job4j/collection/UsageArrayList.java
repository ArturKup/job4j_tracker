package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Petr");
        al.add("Ivan");
        al.add("Stepan");
        for (String s : al) {
            System.out.println(s);
        }
    }
}
