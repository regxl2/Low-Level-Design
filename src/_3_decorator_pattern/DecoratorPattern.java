package _3_decorator_pattern;

// This pattern is used avoid the class explosion.
// for example, if you want a Beverage with 2 or 3 extra toppings, then we have to create many
// to satisfy all the all combinations of toppings.

abstract class Beverage{
    abstract String getDescription();
    abstract int cost();
    // the reason why making abstract, there might be some toppings
    // which might be free and customer might want or not.
}

class HouseBlend extends Beverage{

    @Override
    String getDescription() {
        return "HouseBlend";
    }

    @Override
    int cost() {
        return 100;
    }
}

class DarkRoast extends Beverage{

    @Override
    String getDescription() {
        return "DarkRoast";
    }

    @Override
    int cost() {
        return 110;
    }
}

class Espresso extends Beverage{

    @Override
    String getDescription() {
        return "Espresso";
    }

    @Override
    int cost() {
        return 120;
    }
}

abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    abstract String getDescription();
}

class Milk extends CondimentDecorator{

    Beverage beverage;
    Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + "Milk";
    }

    @Override
    int cost() {
        return beverage.cost() + 10;
    }
}

class Mocha extends CondimentDecorator{

    Beverage beverage;
    Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + "Mocha";
    }

    @Override
    int cost() {
        return beverage.cost() + 20;
    }
}

class Soy extends CondimentDecorator{

    Beverage beverage;
    Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + "Soy";
    }

    @Override
    int cost() {
        return beverage.cost() + 30;
    }
}


public class DecoratorPattern {
    public static void main(String[] args){
        Espresso espresso = new Espresso();
        Beverage espressoWithMilk = new Milk(espresso);
        Beverage espressoWithMilkMocha = new Mocha(espressoWithMilk);
        System.out.println(espressoWithMilk.getDescription());
        System.out.println(espressoWithMilkMocha.cost());

        HouseBlend houseBlend = new HouseBlend();
        Beverage houseBlendWithSoy = new Soy(houseBlend);
        Beverage houseBlendWithSoyMilk = new Milk(houseBlendWithSoy);
        Beverage houseBlendWithSoyMilkMocha = new Mocha(houseBlendWithSoyMilk);
        System.out.println(houseBlendWithSoyMilkMocha.getDescription());
        System.out.println(houseBlendWithSoyMilkMocha.cost());
    }
}
