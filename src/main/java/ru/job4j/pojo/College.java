package ru.job4j.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        student.setName("Aleksei");
        student.setLastName("Ivanov");
        student.setGroup("123");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse("2024-10-23");
        student.setDateEntrance(date);

        System.out.println("Student " + student.getLastName() + " "
                + student.getName()
                + " entrance into group "
                + student.getGroup() + " at "
                + dateFormat.format(student.getDateEntrance()));
    }
}
