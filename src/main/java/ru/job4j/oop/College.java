package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman(); // создание объекта типа Freshman
        Student student = freshman;  // Upcasting
        Object obj = freshman; // Upcasting
    }
}
