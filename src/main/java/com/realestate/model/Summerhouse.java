package com.realestate.model;

import java.math.BigDecimal;

public class Summerhouse extends RealEstate {

    private final double pricePerSquareFoot = 100.82;

    public Summerhouse(String city, int livingRoom, int bedroom, double squareFeet) {
        super(city, livingRoom, bedroom, squareFeet);
    }

    @Override
    public BigDecimal calculatePrice() {
        return BigDecimal.valueOf(pricePerSquareFoot).multiply(BigDecimal.valueOf(squareFeet));
    }

    @Override
    public String toString() {
        return "Summerhouse{" +
                "pricePerSquareFoot=" + pricePerSquareFoot +
                ", squareFeet=" + squareFeet +
                ", livingRoomAmount=" + livingRoomAmount +
                ", bedroomAmount=" + bedroomAmount +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }
}
