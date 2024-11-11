package _6_parking_lot_system.parking_spot;

import _6_parking_lot_system.vehicle.Truck;
import _6_parking_lot_system.vehicle.VehicleType;

public class TruckParkingSpot extends ParkingSpot{
    TruckParkingSpot(){
        vehicleType = VehicleType.TRUCK;
    }
    
    @Override
    public void parkVehicle(String vehicleNumber) {
        vehicle = new Truck(vehicleNumber);
    }
}
