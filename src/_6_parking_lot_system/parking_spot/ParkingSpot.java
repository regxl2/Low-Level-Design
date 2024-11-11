package _6_parking_lot_system.parking_spot;

import _6_parking_lot_system.vehicle.Vehicle;
import _6_parking_lot_system.vehicle.VehicleType;

public abstract class ParkingSpot {
    protected Vehicle vehicle;
    protected VehicleType vehicleType;

    public boolean isAvailable(){
        return vehicle == null;
    }

    public abstract void parkVehicle(String vehicleNumber);

    public void unParkVehicle(){
        vehicle = null;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void displayPlotInfo(){
        if(isAvailable()){
            System.out.println("Spot type: " + vehicleType.name() + ", Vehicle Number: N/A Occupied: False");
        }
        else{
            System.out.println("Spot Type: "+vehicleType.name()+", Vehicle Number: "+vehicle.getVehicleNumber() + " Occupied: True");
        }
    }
}
