package Lectures.Day_7;

public class Dog extends Animal{

    private String type;

    public Dog(String type, boolean veg, String food, int legs ){
        super(veg,food,legs);
        this.type = type;
    }

    @Override
    public void makesound() {
        System.out.println("Woof");
    }

    public String toString() {
        String objStr = "Dog type is: " + type + "\n";
        objStr += "Dog eats: " + this.getEats() + "\n";
        objStr += "Dog has: " + this.getNoOfLegs() + " legs" + "\n";
        objStr += "Is dog Vegetarian?: " + this.isVegetarian() + "\n";
        return objStr;

    }
}
