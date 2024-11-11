package _6_parking_lot_system.parking_spot;

import _6_parking_lot_system.vehicle.Car;
import _6_parking_lot_system.vehicle.VehicleType;

public class CarParkingSpot extends ParkingSpot{
    CarParkingSpot(){
        vehicleType = VehicleType.CAR;
    }

    @Override
    public void parkVehicle(String vehicleNumber) {
        vehicle = new Car(vehicleNumber);
    }
}
