package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
//    super.addExtraCheese();
        addExtraCheese(); //if it is present in the current method..good call it...otherwise go to the parent class
//    this.addExtraCheese();
        addExtraToppings();
    }
}
