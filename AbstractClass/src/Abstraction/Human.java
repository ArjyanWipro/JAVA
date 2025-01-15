package AbstractClass.src.Abstraction;

public class Human extends AnimalAbstract {

    public Human(String name, String address, int age) {
        super(name, address, age);
    }

    public void color(String colorType) {
        if (colorType == "fair") {
            System.out.println("Skin color is "+colorType + " you are like most of the humans");
        } else {
            System.out.println("Skin color is "+colorType + " you are on the top 20% who have this hair color");
        }
    }

    public void medium(String type) {
        System.out.println("Human live in " + type);
    }

    public void eat(String eatingPreference) {
        if (eatingPreference == "non veg") {
            System.out.println("You are a non vegiterian");
        } else if (eatingPreference == "veg") {
            System.out.println("You are a vegiterian");
        } else {
            System.out.println("This is not a valid type");
        }
    }

    public void getHumanDetails(){
        System.out.println(getDetails());
    }
}
