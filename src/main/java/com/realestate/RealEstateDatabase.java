package com.realestate;

import com.realestate.model.House;
import com.realestate.model.RealEstate;
import com.realestate.model.Summerhouse;
import com.realestate.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class RealEstateDatabase {

    List<RealEstate> realEstateList;

    public RealEstateDatabase() {
        realEstateList = new ArrayList<>();
        createHouseList();
    }

    private void createHouseList() {
        RealEstate house1 = new House("Istanbul", 1, 3, 2300);
        RealEstate house2 = new House("Izmir", 2, 3, 2500);
        RealEstate house3 = new House("Ankara", 3, 5, 3700);

        RealEstate summerHouse1 = new Summerhouse("Izmir", 1, 3, 2273);
        RealEstate summerHouse2 = new Summerhouse("Istanbul", 2, 3, 3000);
        RealEstate summerHouse3 = new Summerhouse("Ankara", 1, 1, 1826);

        RealEstate villa1 = new Villa("Izmir", 2, 5, 3000);
        RealEstate villa2 = new Villa("Istanbul", 4, 8, 5900);
        RealEstate villa3 = new Villa("Ankara", 3, 5, 4990);

        realEstateList.addAll(List.of(
                house1, house2, house3,
                summerHouse1, summerHouse2, summerHouse3,
                villa1, villa2, villa3
        ));
    }

    public List<RealEstate> getRealEstateList() {
        return realEstateList;
    }
}
