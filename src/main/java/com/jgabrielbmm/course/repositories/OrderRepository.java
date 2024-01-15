package com.jgabrielbmm.course.repositories;

import com.jgabrielbmm.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
