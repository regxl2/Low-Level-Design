package _6_parking_lot_system;

import _6_parking_lot_system.parking_spot.ParkingSpot;
import _6_parking_lot_system.parking_spot.ParkingSpotFactory;
import _6_parking_lot_system.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel{
    static int count = 0;
    private final int id;
    private final int floor;
    private final List<ParkingSpot> parkingSpots;

    ParkingLevel(int floor, int numberOfBikeSpots, int numberOfCarSpots, int numberOfTruckSpots, ParkingSpotFactory parkingSpotFactory){
        this.id = ++count;
        this.floor = floor;
        parkingSpots = new ArrayList<>();
        for(int i=0; i<numberOfBikeSpots; i++){
            ParkingSpot parkingSpot = parkingSpotFactory.createParkingSpot(VehicleType.BIKE);
            parkingSpots.add(parkingSpot);
        }
        for(int i=0; i<numberOfCarSpots; i++){
            ParkingSpot parkingSpot = parkingSpotFactory.createParkingSpot(VehicleType.CAR);
            parkingSpots.add(parkingSpot);
        }
        for(int i=0; i<numberOfTruckSpots; i++){
            ParkingSpot parkingSpot = parkingSpotFactory.createParkingSpot(VehicleType.TRUCK);
            parkingSpots.add(parkingSpot);
        }
    }

    boolean parkVehicle(String vehicleNumber, VehicleType vehicleType){
        for(ParkingSpot parkingSpot: parkingSpots){
            if(parkingSpot.isAvailable() && parkingSpot.getVehicleType() == vehicleType){
                parkingSpot.parkVehicle(vehicleNumber);
                return true;
            }
        }
        return false;
    }

    boolean unParkVehicle(String vehicleNumber){
        for(ParkingSpot parkingSpot: parkingSpots){
            if(parkingSpot.getVehicle()!=null && parkingSpot.getVehicle().getVehicleNumber().equals(vehicleNumber)){
                parkingSpot.unParkVehicle();
                return true;
            }
        }
        return false;
    }

    void displayLevelInfo(){
        for(ParkingSpot parkingSpot: parkingSpots){
            parkingSpot.displayPlotInfo();
        }
        System.out.println();
    }

    int getFloorNumber(){
        return floor;
    }

    int getParkingLevelId(){
        return id;
    }
}
