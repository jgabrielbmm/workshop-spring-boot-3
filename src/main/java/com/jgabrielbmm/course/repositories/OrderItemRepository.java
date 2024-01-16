package com.jgabrielbmm.course.repositories;

import com.jgabrielbmm.course.entities.OrderItem;
import com.jgabrielbmm.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
