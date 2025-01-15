package AbstractClass.src.Abstraction;

public class Fish extends AnimalAbstract {

  public Fish(String name, String address, int age) {
    super(name, address, age);
  }

  public void color(String colorType) {
    if (colorType == "red") {
      System.out.println("This is a Gold fish");
    } else {
      System.out.println("This is a " + colorType + " color fish");
    }
  }

  public void medium(String type) {
    System.out.println("Fish live in " + type);
  }

  public void eat(String eatingPreference) {
    if (eatingPreference == "non veg") {
      System.out.println("You are a non vegiterian");
    } else if (eatingPreference == "veg") {
      System.out.println("Fish is vegiterian");
    } else {
      System.out.println("This is not a valid type");
    }
  }

  public void getFishDetails(){
    System.out.println(getDetails());
}
}
