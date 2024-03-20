package com.realestate.model;

import java.math.BigDecimal;

public class Villa extends RealEstate {

    private final double pricePerSquareFoot = 400.942;

    public Villa(String city, int livingRoom, int bedroom, double squareFeet) {
        super(city, livingRoom, bedroom, squareFeet);
    }

    @Override
    public BigDecimal calculatePrice() {
        return BigDecimal.valueOf(pricePerSquareFoot).multiply(BigDecimal.valueOf(squareFeet));
    }

    @Override
    public String toString() {
        return "Villa{" +
                "pricePerSquareFoot=" + pricePerSquareFoot +
                ", squareFeet=" + squareFeet +
                ", livingRoomAmount=" + livingRoomAmount +
                ", bedroomAmount=" + bedroomAmount +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }
}
