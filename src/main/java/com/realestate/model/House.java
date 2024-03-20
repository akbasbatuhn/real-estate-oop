package com.realestate.model;

import java.math.BigDecimal;

public class House extends RealEstate {

    private final double pricePerSquareFoot = 120.61;

    public House(String city, int livingRoom, int bedroom, double squareFeet) {
        super(city, livingRoom, bedroom, squareFeet);
    }

    @Override
    public BigDecimal calculatePrice() {
        return BigDecimal.valueOf(pricePerSquareFoot).multiply(BigDecimal.valueOf(squareFeet));
    }

    @Override
    public String toString() {
        return "House{" +
                "pricePerSquareFoot=" + pricePerSquareFoot +
                ", squareFeet=" + squareFeet +
                ", livingRoomAmount=" + livingRoomAmount +
                ", bedroomAmount=" + bedroomAmount +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }
}
