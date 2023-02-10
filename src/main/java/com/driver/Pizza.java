package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private final int cheesePrice;
    private final int toppingPrice;
    private final int paperBagPrice;


    private  boolean extraCheese;
    private boolean isBillGenerated;
    private boolean extraTopping;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.paperBagPrice=20;


        if(isVeg==true){
            this.price=300;
            this.toppingPrice=70;
        }
        else{
            this.price= 400;
            this.toppingPrice=120;
        }
        extraCheese=false;
        extraTopping=false;
        takeAway=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese==false){
            this.price=this.price+this.cheesePrice;
            extraCheese=true;// your code goes here
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTopping==false){
            this.price=this.price+this.toppingPrice;
            extraTopping=true;// your code goes here
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway==false){
            this.price=this.price+this.paperBagPrice;
            takeAway=true;// your code goes here
        }

    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            if(extraCheese==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";// your code goes here
            }
            if(extraTopping==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(takeAway==true){
                this.bill=this.bill+"Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }

        return this.bill;
    }
}
