package Lectures.Day_7;

public class Cat extends Animal{

    private String color;

    public Cat(String color, boolean veg, String food, int legs ){
        super(veg,food,legs);
        this.color = color;

    }

    @Override
    public void makesound() {
        System.out.println("Meow");
    }

    public String toString() {
        String objStr = "Cat color is: " + color + "\n";
        objStr += "Cat eats: " + this.getEats() + "\n";
        objStr += "Cat has: " + this.getNoOfLegs() + " legs" + "\n";
        objStr += "Is cat Vegetarian?: " + this.isVegetarian() + "\n";
        return objStr;

    }

}
