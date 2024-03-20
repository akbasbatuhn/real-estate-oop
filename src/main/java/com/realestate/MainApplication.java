package com.realestate;

public class MainApplication {
    public static void main(String[] args) {
        RealEstateDatabase database = new RealEstateDatabase();
        RealEstateService service = new RealEstateService(database);

        System.out.println("Total price for houses : $" + service.calculateTotalHousePrice());
        System.out.println("Total price for villas : $" + service.calculateTotalVillaPrice());
        System.out.println("Total price for summerhouses : $" + service.calculateTotalSummerhousePrice());
        System.out.println("Total price for real estates : $" + service.calculateTotalRealEstatePrice());
        System.out.println("Average square feet for houses : " + service.calculateAverageSquareFeetHouse());
        System.out.println("Average square feet for villas : " + service.calculateAverageSquareFeetVilla());
        System.out.println("Average square feet for summerhouses : " + service.calculateAverageSquareFeetSummerhouse());
        System.out.println("Average square feet for real estate : " + service.calculateAverageSquareFeetAllRealEstate());
        System.out.println("Get real estates that has 2 living room, 3 bedroom " + service.getFilteredHouses(2, 3).toString());
    }
}
