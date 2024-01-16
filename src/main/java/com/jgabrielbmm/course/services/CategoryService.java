package com.jgabrielbmm.course.services;

import com.jgabrielbmm.course.entities.Category;
import com.jgabrielbmm.course.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }


    public Category findById(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }


}
