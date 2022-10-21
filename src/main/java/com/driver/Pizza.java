package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAway;
    private boolean isBillGenerated;
    private int extraCheesePrize;
    private int extraToppingsPrize;
    private int takeAwayPrize;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeAway=false;
        this.isBillGenerated=false;

        this.extraCheesePrize=80;
        this.takeAwayPrize=20;
        if(isVeg){
            this.price=300;
            this.extraToppingsPrize=70;
        }else{
            this.price=400;
            this.extraToppingsPrize=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isCheeseAdded){
            this.price+=this.extraCheesePrize;
            this.isCheeseAdded=true; //so that it is not added repeatedly
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            this.price+=this.extraToppingsPrize;
            this.isToppingAdded=true; //so that it is not added repeatedly
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=this.takeAwayPrize;
            this.isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            this.isBillGenerated=true;
            if(this.isCheeseAdded){
                this.bill=this.bill+"Extra Cheese Added: "+this.extraCheesePrize+"\n";
            }
            if(this.isToppingAdded){
                this.bill=this.bill+"Extra Toppings Added: "+this.extraToppingsPrize+"\n";
            }
            if(this.isTakeAway){
                this.bill=this.bill+"Paperbag Added: "+this.takeAwayPrize+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";
        }
        return this.bill;
    }
}
