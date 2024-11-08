package com.shrayansh.decoratorPattern.topping;

import com.shrayansh.decoratorPattern.basePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
