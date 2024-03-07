/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhea.pembayaran.controller;

import com.dhea.pembayaran.entity.Pembayaran;
import com.dhea.pembayaran.service.PembayaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author dhea
 */
@RestController
@RequestMapping("api/v1/pembayaran")
public class PembayaranController {
    private final PembayaranService pembayaranService;

    @Autowired
    public PembayaranController(PembayaranService pembayaranService) {
        this.pembayaranService = pembayaranService;
    }

    @GetMapping
    public ResponseEntity<List<Pembayaran>> getAllPembayaran() {
        List<Pembayaran> pembayaranList = pembayaranService.findAll();
        return new ResponseEntity<>(pembayaranList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pembayaran> getPembayaranById(@PathVariable Long id) {
        Optional<Pembayaran> pembayaran = pembayaranService.findById(id);
        return pembayaran.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Pembayaran> createPembayaran(@RequestBody Pembayaran pembayaran) {
        Pembayaran newPembayaran = pembayaranService.save(pembayaran);
        return new ResponseEntity<>(newPembayaran, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePembayaran(@PathVariable Long id) {
        pembayaranService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
