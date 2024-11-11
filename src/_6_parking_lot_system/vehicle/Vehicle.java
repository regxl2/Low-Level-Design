package _6_parking_lot_system.vehicle;

public abstract class Vehicle {
    private final String vehicleNumber;
    public Vehicle(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
