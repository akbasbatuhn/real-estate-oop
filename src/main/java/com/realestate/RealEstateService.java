package com.realestate;

import com.realestate.model.House;
import com.realestate.model.RealEstate;
import com.realestate.model.Summerhouse;
import com.realestate.model.Villa;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class RealEstateService {

    private RealEstateDatabase realEstateDatabase;

    public RealEstateService(RealEstateDatabase realEstateDatabase) {
        this.realEstateDatabase = realEstateDatabase;
    }

    public BigDecimal calculateTotalHousePrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for(RealEstate realEstate : realEstateDatabase.getRealEstateList()) {
            if(realEstate.getClass() == House.class) {
                totalPrice = totalPrice.add(realEstate.getPrice());
            }
        }

        return totalPrice;
    }

    public BigDecimal calculateTotalVillaPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for(RealEstate realEstate : realEstateDatabase.getRealEstateList()) {
            if(realEstate.getClass() == Villa.class) {
                totalPrice = totalPrice.add(realEstate.getPrice());
            }
        }

        return totalPrice;
    }

    public BigDecimal calculateTotalSummerhousePrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for(RealEstate realEstate : realEstateDatabase.getRealEstateList()) {
            if(realEstate.getClass() == Summerhouse.class) {
                totalPrice = totalPrice.add(realEstate.getPrice());
            }
        }

        return totalPrice;
    }

    public BigDecimal calculateTotalRealEstatePrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for(RealEstate realEstate : realEstateDatabase.getRealEstateList()) {
            totalPrice = totalPrice.add(realEstate.getPrice());
        }

        return totalPrice;
    }

    public double calculateAverageSquareFeetHouse() {
        int count = 0;
        double totalSquareFeet = 0.0f;

        for(RealEstate realEstate : realEstateDatabase.getRealEstateList()) {
            if(realEstate.getClass() == House.class) {
                totalSquareFeet += realEstate.getSquareFeet();
                count++;
            }
        }

        if(count == 0)
            return 0;

        return totalSquareFeet / count;
    }

    public double calculateAverageSquareFeetVilla() {
        int count = 0;
        double totalSquareFeet = 0.0f;

        for(RealEstate realEstate : realEstateDatabase.getRealEstateList()) {
            if(realEstate.getClass() == Villa.class) {
                totalSquareFeet += realEstate.getSquareFeet();
                count++;
            }
        }

        if(count == 0)
            return 0;

        return totalSquareFeet / count;
    }

    public double calculateAverageSquareFeetSummerhouse() {
        int count = 0;
        double totalSquareFeet = 0.0f;

        for(RealEstate realEstate : realEstateDatabase.getRealEstateList()) {
            if(realEstate.getClass() == Summerhouse.class) {
                totalSquareFeet += realEstate.getSquareFeet();
                count++;
            }
        }

        if(count == 0)
            return 0;

        return totalSquareFeet / count;
    }

    public double calculateAverageSquareFeetAllRealEstate() {
        int count = 0;
        double totalSquareFeet = 0.0f;

        for(RealEstate realEstate : realEstateDatabase.getRealEstateList()) {
            totalSquareFeet += realEstate.getSquareFeet();
            count++;
        }

        if(count == 0)
            return 0;

        return totalSquareFeet / count;
    }

    public List<RealEstate> getFilteredHouses(int livingRoom, int bedroom) {
        return realEstateDatabase.getRealEstateList()
                .stream().filter(estate ->
                    estate.getBedroomAmount() == bedroom && estate.getLivingRoomAmount() == livingRoom
                ).collect(Collectors.toList());
    }
}
