package com.example.todoapp.controller;

import com.example.todoapp.entity.Priority;
import com.example.todoapp.repo.PriorityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priority")
public class PriorityController {
    private PriorityRepository priorityRepository;

    public PriorityController(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    @GetMapping("/test")
    public List<Priority> test() {
        List<Priority> list = priorityRepository.findAll();
        System.out.println("list = " + list);

        return list;
    }

    @PostMapping("/add")
    public Priority add(@RequestBody Priority priority) {
        return priorityRepository.save(priority);
    }
}
