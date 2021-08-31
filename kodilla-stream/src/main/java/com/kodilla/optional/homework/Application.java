package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Wick", new Teacher("Harrison Ford")));
        students.add(new Student("Neo", new Teacher("Oracle")));
        students.add(new Student("Spider-man", null));
        students.add(new Student("Rambo", new Teacher("Commando")));
        students.add(new Student("John Wick", null));

        for (Student student : students) {
            System.out.print("Student: " + student.getName() + " Teacher: ");
            Optional.ofNullable(student.getTeacher()).ifPresent(t-> System.out.println(t.getName()));
            if (student.getTeacher() == null)
                System.out.println("<undefined>");
        }
    }
}
