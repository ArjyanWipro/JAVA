package AbstractClass.src.StoreProject;

public class Book extends ProductForStoreAbstract {
    public Book(String type, int price, String description) {
        super(type, price, description);
    }

    public void showDetails() {
        System.out.println("This is a "+getType()+" It will cost "+getPrice()+" Description "+getDescripton()
        +"Written by leo chekoslovakia");
    }
}
