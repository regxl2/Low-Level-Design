package _6_parking_lot_system.parking_spot;

import _6_parking_lot_system.vehicle.VehicleType;

public class ParkingSpotFactory {
    public ParkingSpot createParkingSpot(VehicleType vehicleType){
        if(vehicleType == VehicleType.BIKE) return new BikeParkingSpot();
        else if(vehicleType == VehicleType.CAR) return new CarParkingSpot();
        return new TruckParkingSpot();
    }
}
