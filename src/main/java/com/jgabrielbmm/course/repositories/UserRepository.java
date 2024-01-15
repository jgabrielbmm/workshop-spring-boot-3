package com.jgabrielbmm.course.repositories;

import com.jgabrielbmm.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
