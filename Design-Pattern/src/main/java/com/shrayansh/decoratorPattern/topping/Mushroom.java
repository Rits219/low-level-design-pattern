package com.shrayansh.decoratorPattern.topping;

import com.shrayansh.decoratorPattern.basePizza.BasePizza;

public class Mushroom extends ToppingDecorator {
    private BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 5;
    }
}
