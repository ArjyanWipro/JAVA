package AbstractClass.src.Abstraction;

import java.util.ArrayList; 
public class Main {
    public static void main(String[] args) {

        Human human= new Human("Arjyan", "cuttack", 23);

        Fish fish=new Fish("Gold fish", "pecific ocen", 2);

        ArrayList <AnimalAbstract> animalArrayList= new ArrayList<>();

        animalArrayList.add(human);
        animalArrayList.add(fish);

        animalArrayList.add(new Human("Aditya", "puri", 25));
        animalArrayList.add(new Fish("Shark", "north west", 4));

    
        fish.medium("Water");
        fish.color("red");
        fish.eat("veg");
        fish.getFishDetails();


        System.out.println("-".repeat(30));
        human.color("fair");
        human.eat("non veg");
        human.medium("ground");
        human.getHumanDetails();
    }
}
