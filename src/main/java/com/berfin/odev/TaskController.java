package com.berfin.odev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<String> tasks = new ArrayList<>(Arrays.asList("Jenkins Kurulumu", "Docker Konteynir Hazirligi"));

    public static void main(String[] args) {
        SpringApplication.run(TaskController.class, args);
    }

    @GetMapping
    public List<String> getTasks() {
        return tasks;
    }

    @PostMapping
    public String addTask(@RequestBody String task) {
        tasks.add(task);
        return "Gorev basariyla eklendi!";
    }
}
