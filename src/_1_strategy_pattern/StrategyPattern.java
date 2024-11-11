package _1_strategy_pattern;

interface DriveBehaviour{
    void drive();
}

class NormaDriveBehaviour implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Normal drive behaviour");
    }
}

class SportDriveBehaviour implements DriveBehaviour {
    @Override
    public void drive(){
        System.out.println("Sports drive behaviour");
    }
}

interface Vehicle{
    void drive();
}

class GoodsVehicle implements Vehicle {
    DriveBehaviour driveBehaviour;

    GoodsVehicle(DriveBehaviour driveBehaviour){
        this.driveBehaviour = driveBehaviour;
    }

    @Override
    public void drive() {
        driveBehaviour.drive();
    }
}

class SportsVehicle implements Vehicle {
    DriveBehaviour driveBehaviour;

    SportsVehicle(DriveBehaviour driveBehaviour){
        this.driveBehaviour = driveBehaviour;
    }

    @Override
    public void drive() {
        driveBehaviour.drive();
    }
}

class Bike implements Vehicle {
    DriveBehaviour driveBehaviour;

    Bike(DriveBehaviour driveBehaviour){
        this.driveBehaviour = driveBehaviour;
    }

    @Override
    public void drive() {
        driveBehaviour.drive();
    }
}

public class StrategyPattern {
    public static void main(String[] str){
        // By making the DriveBehaviour interface, we avoid the duplicate code.
        // In this Bike and SportsVehicle both needed the same drive functionality,
        // instead of overriding the with same code; we made the use of composition over inheritance.
        // We made the sportDriveBehaviour and constructor injected in both Bike and SportsVehicle.

        DriveBehaviour sportDriveBehaviour = new SportDriveBehaviour();
        DriveBehaviour normalDriveBehaviour = new NormaDriveBehaviour();
        Vehicle goodsVehicle = new GoodsVehicle(normalDriveBehaviour);
        Vehicle sportsVehicle = new SportsVehicle(sportDriveBehaviour);
        Vehicle bike = new Bike(sportDriveBehaviour);
        goodsVehicle.drive();
        sportsVehicle.drive();
        bike.drive();

        // We can also use the strategy pattern where two unrelated class such as Bird and Airplane
        // both are different class but can have the same functionality of flying. So, we have
        // make FlyingBehaviour and inject to both Bird and Airplane class instead of overriding
        // functionality in both class.
    }
}
