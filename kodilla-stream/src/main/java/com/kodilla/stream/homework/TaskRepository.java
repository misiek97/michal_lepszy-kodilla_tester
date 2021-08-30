package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasksList() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("open door", LocalDate.now(), LocalDate.of(2019, 11, 20)));
        tasks.add(new Task("close door", LocalDate.now(), LocalDate.of(2022, 1, 2)));
        tasks.add(new Task("repair door", LocalDate.now(),LocalDate.of(2028, 11, 20)));
        tasks.add(new Task("buy door", LocalDate.now(), LocalDate.of(2019, 11, 20)));
        tasks.add(new Task("sell door", LocalDate.now(), LocalDate.of(2019, 11, 20)));
        return tasks;
    }
}
