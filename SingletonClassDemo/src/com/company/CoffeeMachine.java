package com.company;

class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;

    static private CoffeeMachine my = null;
    static private int count = 0;
    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
    }

    static CoffeeMachine getInstance() {
        if (my == null) {
            my = new CoffeeMachine();
        }
        count ++;
        if (count <= 3)
            return my;
        else
            return null;
    }
}
