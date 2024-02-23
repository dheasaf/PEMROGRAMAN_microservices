/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhea.produk.controller;

import com.dhea.produk.entity.Produk;
import com.dhea.produk.service.ProdukService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Dhea
 */
@RestController
@RequestMapping("api/v1/product")
public class ProdukController {
    @Autowired
    private ProdukService produkService;
    
    @GetMapping
    public List<Produk>getAll(){
        return produkService.getAll();
        
    }
    
    @PostMapping
    public void insert(@RequestBody Produk produk){
        produkService.insert(produk);
    }   
}
