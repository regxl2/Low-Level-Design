package _6_parking_lot_system;

import _6_parking_lot_system.parking_spot.ParkingSpotFactory;
import _6_parking_lot_system.vehicle.VehicleType;

import java.util.*;

public class ParkingLot{
    private final Map<Integer, ParkingLevel> parkingLevelMap;
    private final Scanner scanner;
    private final ParkingSpotFactory parkingSpotFactory;

    ParkingLot(Scanner scanner, ParkingSpotFactory parkingSpotFactory){
        parkingLevelMap = new LinkedHashMap<>();
        this.scanner = scanner;
        this.parkingSpotFactory = parkingSpotFactory;
    }

    void addParkingLevel(){
        int floor, bikeSpots, carSpots, truckSpot;
        try{
            System.out.print("Enter the floor number of the parking level: ");
            floor = scanner.nextInt();
            System.out.print("Enter the number of Bike Spots: ");
            bikeSpots = scanner.nextInt();
            System.out.print("Enter the number of Car Spots: ");
            carSpots = scanner.nextInt();
            System.out.print("Enter the number of Truck Spots: ");
            truckSpot = scanner.nextInt();
            ParkingLevel parkingLevel = new ParkingLevel(floor, bikeSpots, carSpots, truckSpot, parkingSpotFactory);
            parkingLevelMap.put(parkingLevel.getParkingLevelId(), parkingLevel);
        }
        catch (NumberFormatException ex){
            System.out.println("Please enter the number correctly");
        }
    }

    void displayParkingLevel(){
        for(Map.Entry<Integer, ParkingLevel> parkingLevelEntry: parkingLevelMap.entrySet()){
            System.out.println("\nParking Level no: "+parkingLevelEntry.getKey());
            parkingLevelEntry.getValue().displayLevelInfo();
            System.out.println();
        }
    }

    void parkVehicle(int parkingLevelId, String vehicleNumber, VehicleType vehicleType){
        if(parkingLevelMap.containsKey(parkingLevelId)){
            ParkingLevel parkingLevel = parkingLevelMap.get(parkingLevelId);
            if(parkingLevel.parkVehicle(vehicleNumber, vehicleType)){
                System.out.println("Vehicle parked successfully");
            }
            else{
                System.out.println("No Space available");
            }
        }
        else{
            System.out.println("Please enter the valid parking level id");
        }
    }

    void unParkVehicle(int parkingLevelId, String vehicleNumber){
        if(parkingLevelMap.containsKey(parkingLevelId)){
            ParkingLevel parkingLevel = parkingLevelMap.get(parkingLevelId);
            parkingLevel.unParkVehicle(vehicleNumber);
            System.out.println("Vehicle unparked successfully");
        }
        else{
            System.out.println("Please enter the valid parking level id");
        }
    }
}
