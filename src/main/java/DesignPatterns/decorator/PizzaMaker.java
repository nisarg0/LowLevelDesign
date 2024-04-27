package DesignPatterns.decorator;

abstract class BasePizza {
    public abstract int cost();
}

// Follows both IS-A and HAS-A relationships

abstract class ToppingDecorator extends BasePizza {
    BasePizza basePizza;
    public abstract int cost();
}

class VeggieDelightPizza extends BasePizza {
    @Override
    public int cost() {
        return 160;
    }
}

class FarmhousePizza extends BasePizza {
    @Override
    public int cost() {
        return 125;
    }
}

class MargaritaPizza extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}

class CheeseTopping extends ToppingDecorator {
    BasePizza basePizza;

    CheeseTopping(BasePizza pizza) {
        basePizza = pizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}

class OliveTopping extends ToppingDecorator {
    BasePizza basePizza;

    OliveTopping(BasePizza pizza) {
        basePizza = pizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}

class PannerTopping extends ToppingDecorator {
    BasePizza basePizza;

    PannerTopping(BasePizza pizza) {
        basePizza = pizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 100;
    }
}




public class PizzaMaker {
    public static void main(String[] args) {
        BasePizza veggieDelightPizza = new VeggieDelightPizza();   // Plain veggie delight pizza
        veggieDelightPizza = new CheeseTopping(veggieDelightPizza); // veggieDelight is assigned 1 topping
        veggieDelightPizza = new OliveTopping(veggieDelightPizza); // veggieDelight is reassigned value with two toppings
        System.out.println("Cost of Veggie Delight + Cheese & Olive toppings is " + veggieDelightPizza.cost());

        BasePizza farmhousePizza = new FarmhousePizza();
        farmhousePizza = new CheeseTopping(farmhousePizza);
        farmhousePizza = new OliveTopping(farmhousePizza);
        System.out.println("Cost of farmhouse with Cheese and Olive toppings is " + farmhousePizza.cost());

        BasePizza margaritaPizza = new MargaritaPizza();
        margaritaPizza = new PannerTopping(margaritaPizza);
        System.out.println("Cost of MargaritaPizza with Panner topping is " + margaritaPizza.cost());
        
    }
}
