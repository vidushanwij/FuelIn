package com.ase.fuelin.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "customer_id", unique = true)
    private int customerId;

    @Column(name = "first_name", columnDefinition = "VARCHAR(30)", nullable = false)
    private String firstName;

    @Column(name = "last_name", columnDefinition = "VARCHAR(30)", nullable = false)
    private String lastName;

    @Column(name = "email", columnDefinition = "VARCHAR(100)")
    private String emailAddress;

    @Column(name = "phone_num", nullable = false)
    private int phoneNumber;

    @Column(name = "vehicle_num", nullable = false)
    private int vehicleRegNumber;

    @Column(name = "quota")
    private float quota;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Token> tokens;

    public Customer(int customerId, String firstName, String lastName, String emailAddress, int phoneNumber, int vehicleRegNumber, float quota, List<Token> tokens) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.vehicleRegNumber = vehicleRegNumber;
        this.quota = quota;
        this.tokens = tokens;
    }

    public Customer(){};

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    public void setVehicleRegNumber(int vehicleRegNumber) {
        this.vehicleRegNumber = vehicleRegNumber;
    }

    public float getQuota() {
        return quota;
    }

    public void setQuota(float quota) {
        this.quota = quota;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
}
