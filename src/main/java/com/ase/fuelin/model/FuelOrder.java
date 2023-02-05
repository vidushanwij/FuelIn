package com.ase.fuelin.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "FuelOrder")
public class FuelOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "order_id",unique = true)
    private int orderId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "station_id")
    private FuelStation fuelStation;

    @Column(name = "order_date", nullable = false)
    private Date orderDate;

    @Column(name = "order_amount", nullable = false)
    private float orderAmount;

    @Column(name = "delivery_status", columnDefinition = "VARCHAR(200)", nullable = false)
    private String deliveryStatus;

    public FuelOrder(int orderId, FuelStation fuelStation, Date orderDate, float orderAmount, String deliveryStatus) {
        this.orderId = orderId;
        this.fuelStation = fuelStation;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.deliveryStatus = deliveryStatus;
    }

    public FuelOrder() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public FuelStation getFuelStation() {
        return fuelStation;
    }

    public void setFuelStation(FuelStation fuelStation) {
        this.fuelStation = fuelStation;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
