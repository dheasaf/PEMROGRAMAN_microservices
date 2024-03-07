/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dhea.order.repository;

import com.dhea.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dhea
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
