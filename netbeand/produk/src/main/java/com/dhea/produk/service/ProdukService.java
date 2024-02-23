/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhea.produk.service;

import com.dhea.produk.entity.Produk;
import com.dhea.produk.repository.ProdukRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dhea
 */
@Service
public class ProdukService {
    @Autowired
    
    private ProdukRepository productRepository;
    
    public List<Produk> getAll(){
        return productRepository.findAll();
    }
    
    public void insert(Produk produk){
        productRepository.save(produk);
    }
}