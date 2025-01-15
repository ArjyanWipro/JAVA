package AbstractClass.src.StoreProject;

public class Pen extends ProductForStoreAbstract {
    public Pen(String type, int price, String description) {
        super(type, price, description);
    }


    public void showDetails() {
        System.out.println("This is a "+getType()+" It will cost "+getPrice()+" Description "+getDescripton()
        +" It is made in USA");
    }
    
}
