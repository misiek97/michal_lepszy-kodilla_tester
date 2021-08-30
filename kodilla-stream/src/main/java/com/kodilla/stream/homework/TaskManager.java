package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> taskDeadLines = TaskRepository.getTasksList()   // [1]
                .stream()
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .map(TaskManager::getDeadLine)
                .collect(Collectors.toList());                       // [2]
        System.out.println(taskDeadLines);
    }

    public static LocalDate getDeadLine(Task task) {
        return task.getDeadline();
    }
}
