package com.shrayansh.decoratorPattern;

import com.shrayansh.decoratorPattern.basePizza.BasePizza;
import com.shrayansh.decoratorPattern.basePizza.VegDelight;
import com.shrayansh.decoratorPattern.topping.ExtraCheese;
import com.shrayansh.decoratorPattern.topping.Mushroom;

public class PizzaStore {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Mushroom(new ExtraCheese(new VegDelight())));
        System.out.println(pizza.cost());
    }
}
