package _1_without_strategy_pattern;

interface Vehicle{
    void drive();
}

class GoodsVehicle implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Normal drive");
    }
}

class SportsVehicle implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Sports drive");
    }
}

class Bike implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Sports drive");
    }
}

// You can see both child class Bike and SportsVehicle inherit override the drive() function
// with same code, this is duplicate code. If other classes which need other same drive functionality,
// then also we have to override the code in all classes.
// This is not a good solution. The solution to this problem is composition over inheritance.



public class WithoutStrategyPattern {
    public static void main(String[] str){
        Vehicle goodsVehicle = new GoodsVehicle();
        Vehicle sportsVehicle = new SportsVehicle();
        Vehicle bike = new Bike();
        bike.drive();
        sportsVehicle.drive();
        goodsVehicle.drive();
    }
}
