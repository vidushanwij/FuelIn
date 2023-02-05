package com.ase.fuelin.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "delivery_id", unique = true)
    private int deliveryId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "station_id")
    private FuelStation fuelStation;

    @Column(name = "delivery_date", nullable = false)
    private Date deliveryDate;

    @Column(name = "delivery_time", nullable = false)
    private Timestamp expectedDeliveryTime;

    @Column(name = "amount", nullable = false)
    private float amount;

    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;

    public Delivery(int deliveryId, FuelStation fuelStation, Date deliveryDate, Timestamp expectedDeliveryTime, float amount, String paymentStatus) {
        this.deliveryId = deliveryId;
        this.fuelStation = fuelStation;
        this.deliveryDate = deliveryDate;
        this.expectedDeliveryTime = expectedDeliveryTime;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public Delivery() {
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public FuelStation getFuelStation() {
        return fuelStation;
    }

    public void setFuelStation(FuelStation fuelStation) {
        this.fuelStation = fuelStation;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Timestamp getExpectedDeliveryTime() {
        return expectedDeliveryTime;
    }

    public void setExpectedDeliveryTime(Timestamp expectedDeliveryTime) {
        this.expectedDeliveryTime = expectedDeliveryTime;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
