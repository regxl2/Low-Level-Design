package _6_parking_lot_system.parking_spot;

import _6_parking_lot_system.vehicle.Bike;
import _6_parking_lot_system.vehicle.VehicleType;

public class BikeParkingSpot extends ParkingSpot{
    BikeParkingSpot(){
        vehicleType = VehicleType.BIKE;
    }
    @Override
    public void parkVehicle(String vehicleNumber) {
        vehicle = new Bike(vehicleNumber);
    }
}