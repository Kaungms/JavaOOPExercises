package Lectures.Day_7;

public class AnimalTest {
    static Animal[] animals = new Animal[100];

    public static void main(String[] args) {
        Cat cat1 = new Cat("black",false,"catfood",4);
        Cat cat2 = new Cat("white",false,"catfood",4);
        Dog dog1 = new Dog("GR",false,"meat",4);
        Dog dog2 = new Dog("Bull",false,"meat",4);

        animals[0] = cat1;
        animals[1] = dog1;
        animals[2] = cat2;
        animals[3] = dog2;


        for(int i=0; i<Animal.getCount();i++){
            System.out.println(animals[i]);
            animals[i].makesound();
        }



    }
}
