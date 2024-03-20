package com.realestate.model;

import java.math.BigDecimal;

public abstract class RealEstate {
    double squareFeet;
    int livingRoomAmount;
    int bedroomAmount;
    String city;
    BigDecimal price;

    protected RealEstate(String city, int livingRoomAmount, int bedroomAmount, double squareFeet) {
        this.city = city;
        this.livingRoomAmount = livingRoomAmount;
        this.bedroomAmount = bedroomAmount;
        this.squareFeet = squareFeet;
        price = this.calculatePrice();
    }

    public abstract BigDecimal calculatePrice();

    public int getLivingRoomAmount() {
        return livingRoomAmount;
    }

    public void setLivingRoomAmount(int livingRoomAmount) {
        this.livingRoomAmount = livingRoomAmount;
    }

    public int getBedroomAmount() {
        return bedroomAmount;
    }

    public void setBedroomAmount(int bedroomAmount) {
        this.bedroomAmount = bedroomAmount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }
}
