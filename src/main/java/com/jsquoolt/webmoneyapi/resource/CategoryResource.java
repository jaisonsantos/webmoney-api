package com.jsquoolt.webmoneyapi.resource;

import com.jsquoolt.webmoneyapi.model.Category;
import com.jsquoolt.webmoneyapi.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {
    
    private final CategoryRepository categoryRepository;

    public CategoryResource(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    
    @GetMapping
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
