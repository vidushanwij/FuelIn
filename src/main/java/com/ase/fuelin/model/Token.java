package com.ase.fuelin.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "token_id", unique = true)
    private int tokenId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer", referencedColumnName = "customer_id")
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fuel_station", referencedColumnName = "station_id" )
    private FuelStation fuelStation;

    @Column(name = "issue_date", nullable = false)
    private Date tokenIssueDate;

    @Column(name = "allocated_time", nullable = false)
    private Date allocatedDateTime;

    @Column(name = "allocated_fuelamount")
    private float allocatedFuelAmount;

    @Column(name = "filling_time", nullable = false)
    private int expectedFillingTimeInMins;

    @Column(name = "usage_status", columnDefinition = "VARCHAR(50)", nullable = false)
    private String usageStatus;

    public Token(int tokenId, Customer customer, FuelStation fuelStation, Date tokenIssueDate, Date allocatedDateTime, float allocatedFuelAmount, int expectedFillingTimeInMins, String usageStatus) {
        this.tokenId = tokenId;
        this.customer = customer;
        this.fuelStation = fuelStation;
        this.tokenIssueDate = tokenIssueDate;
        this.allocatedDateTime = allocatedDateTime;
        this.allocatedFuelAmount = allocatedFuelAmount;
        this.expectedFillingTimeInMins = expectedFillingTimeInMins;
        this.usageStatus = usageStatus;
    }

    public Token() {
    }

    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public FuelStation getFuelStation() {
        return fuelStation;
    }

    public void setFuelStation(FuelStation fuelStation) {
        this.fuelStation = fuelStation;
    }

    public Date getTokenIssueDate() {
        return tokenIssueDate;
    }

    public void setTokenIssueDate(Date tokenIssueDate) {
        this.tokenIssueDate = tokenIssueDate;
    }

    public Date getAllocatedDateTime() {
        return allocatedDateTime;
    }

    public void setAllocatedDateTime(Date allocatedDateTime) {
        this.allocatedDateTime = allocatedDateTime;
    }

    public float getAllocatedFuelAmount() {
        return allocatedFuelAmount;
    }

    public void setAllocatedFuelAmount(float allocatedFuelAmount) {
        this.allocatedFuelAmount = allocatedFuelAmount;
    }

    public int getExpectedFillingTimeInMins() {
        return expectedFillingTimeInMins;
    }

    public void setExpectedFillingTimeInMins(int expectedFillingTimeInMins) {
        this.expectedFillingTimeInMins = expectedFillingTimeInMins;
    }

    public String getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
    }


}
