/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhea.pembayaran.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 *
 * @author dhea
 */
@Entity
@Table(name="t_pembayaran")
public class Pembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private String modePembayaran;
    private int refNumber;
    private String tglBayar;
    private String status;
    private double total;

   
    public Pembayaran() {
    }

    public Pembayaran(Long orderId, String modePembayaran, int refNumber, String tglBayar, String status, double total) {
        this.orderId = orderId;
        this.modePembayaran = modePembayaran;
        this.refNumber = refNumber;
        this.tglBayar = tglBayar;
        this.status = status;
        this.total = total;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getModePembayaran() {
        return modePembayaran;
    }

    public void setModePembayaran(String modePembayaran) {
        this.modePembayaran = modePembayaran;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }

    public String getTglBayar() {
        return tglBayar;
    }

    public void setTglBayar(String tglBayar) {
        this.tglBayar = tglBayar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
    
   
