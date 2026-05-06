package com.decodelabs.shoemartbackend.Repository;

import com.decodelabs.shoemartbackend.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
