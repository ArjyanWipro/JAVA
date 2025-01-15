package AbstractClass.src.StoreProject;

public class Copy extends ProductForStoreAbstract {
    public Copy(String type, int price, String description) {
        super(type, price, description);
    }

    public void showDetails() {
        System.out.println("This is a "+getType()+" It will cost "+getPrice()+" Description "+getDescripton()+
        " Made in India");
    }
}
