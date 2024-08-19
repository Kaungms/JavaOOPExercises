package Lectures.Day_7;

public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    private static int count = 0;

    public Animal(boolean vegetarian,String eats,int noOfLegs){
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
        count++;
    }

    public void makesound(){
        System.out.println("animal is making a sound");
    }

    public static int getCount() {
        return count;
    }



    public boolean isVegetarian() {
        return this.vegetarian;
    }

    public int getNoOfLegs() {
        return this.noOfLegs;
    }

    public String getEats() {
        return this.eats;
    }

    public void setVegetarian(boolean veg){
        this.vegetarian = veg;
    }

    public void setEats(String food){
        this.eats = food;
    }

    public void setNoOfLegs(int legs){
        this.noOfLegs = legs;
    }





}
