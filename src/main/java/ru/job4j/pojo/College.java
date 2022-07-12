package ru.job4j.pojo;

import java.time.LocalDate;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Иван Иванов");
        st1.setGroup(1);
        st1.setDateOfAdmission(LocalDate.of(2021, 07, 01));
        System.out.println("Студент: " + st1.getName());
        System.out.println("Группа № " + st1.getGroup());
        System.out.println("Дата поступления " + st1.getDateOfAdmission());
    }
}
