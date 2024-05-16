/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dea.produk.repository;
import com.dea.produk.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author dhea
 */
@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
    
    
}
