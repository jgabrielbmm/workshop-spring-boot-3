package com.jgabrielbmm.course.repositories;

import com.jgabrielbmm.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
