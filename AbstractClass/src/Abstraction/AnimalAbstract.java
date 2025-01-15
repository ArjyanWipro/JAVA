package AbstractClass.src.Abstraction;

public abstract class AnimalAbstract {
    private String name;
    private String address;
    private int age;

    public AnimalAbstract(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getDetails(){
        return "Name= "+name+" lives in "+address+" age is "+age;
    }

    public abstract void color(String color);

    public abstract void medium(String type);

    public abstract void eat(String typeOfFood);
}
