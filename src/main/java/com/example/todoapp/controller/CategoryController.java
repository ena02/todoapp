package com.example.todoapp.controller;

import com.example.todoapp.entity.Category;
import com.example.todoapp.repo.CategoryRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.geom.AreaOp;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping("/test")
    public List<Category> test() {
        List<Category> list = categoryRepository.findAll();

        return list;
    }
}
