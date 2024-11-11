package _6_parking_lot_system;

import _6_parking_lot_system.parking_spot.ParkingSpotFactory;

import java.util.Scanner;

public class ParkingLotDemo {
    private static void printMessage(){
        System.out.println("Enter 1 for adding parking level");
        System.out.println("Enter 2 to display parking level information");
        System.out.println("Enter 3 for parking vehicle");
        System.out.println("Enter 4 for unparking vehicle");
        System.out.println("Enter any digit except above to exit the parking demo\n");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();
        ParkingLot parkingLot = new ParkingLot(scanner, parkingSpotFactory);
        while(true){
            printMessage();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1: {
                    parkingLot.addParkingLevel();
                    break;
                }
                case 2: {
                    parkingLot.displayParkingLevel();
                    break;
                }
                case 3: {
                    System.out.print("Enter the parking level id:");
                    int parkingLevelId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the vehicle type:");
                    String vehicleType = scanner.nextLine();
                    System.out.print("Enter the vehicle number:");
                    String vehicleNumber = scanner.nextLine();
                    parkingLot.parkVehicle(parkingLevelId, vehicleNumber, vehicleType);
                    break;
                }
                case 4: {
                    System.out.print("Enter the parking level id:");
                    int parkingLevelId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the vehicle number:");
                    String vehicleNumber = scanner.nextLine();
                    parkingLot.unParkVehicle(parkingLevelId, vehicleNumber);
                    break;
                }
                default: {
                    System.out.println("Exiting parking demo...");
                    return;
                }
            }
        }
    }

}
