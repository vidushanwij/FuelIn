package com.ase.fuelin.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "fuel_station")
public class FuelStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "station_id", unique = true)
    private int fuelStationId;

    @Column(name = "station_name", columnDefinition = "VARCHAR(50)", nullable = false)
    private String fuelStationName;

    @Column(name = "address", columnDefinition = "VARCHAR(200)", nullable = false)
    private String address;

    @Column(name = "contact_num", nullable = false)
    private int contactNumber;

    @Column(name = "capacity", nullable = false)
    private float capacity;

    @OneToMany(mappedBy = "fuelStation", cascade = CascadeType.ALL)
    private List<Delivery> deliveries;

    @OneToMany(mappedBy = "fuelStation", cascade = CascadeType.ALL)
    private List<FuelOrder> orders;

    @OneToMany(mappedBy = "fuelStation", cascade = CascadeType.ALL)
    private List<Token> tokens;

    public FuelStation(int fuelStationId, String fuelStationName, String address, int contactNumber, float capacity, List<Delivery> deliveries, List<FuelOrder> orders, List<Token> tokens) {
        this.fuelStationId = fuelStationId;
        this.fuelStationName = fuelStationName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.capacity = capacity;
        this.deliveries = deliveries;
        this.orders = orders;
        this.tokens = tokens;
    }

    public FuelStation(){};

    public int getFuelStationId() {
        return fuelStationId;
    }

    public void setFuelStationId(int fuelStationId) {
        this.fuelStationId = fuelStationId;
    }

    public String getFuelStationName() {
        return fuelStationName;
    }

    public void setFuelStationName(String fuelStationName) {
        this.fuelStationName = fuelStationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public List<FuelOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<FuelOrder> orders) {
        this.orders = orders;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
}
