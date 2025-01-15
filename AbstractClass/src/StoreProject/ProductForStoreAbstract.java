package AbstractClass.src.StoreProject;

public abstract class ProductForStoreAbstract {

    private String type;
    private int price;
    private String description;

    public ProductForStoreAbstract(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    //Getters
    public String getType(){
        return type;
    }

    public int getPrice(){
        return price;
    }

    public String getDescripton(){
        return description;
    }

    public String salePrice(int quantity) {
        return "Total price to pay (" + quantity * price + ")";
    }

    public String pricedLine(int quantity) {
        return "Item name " + type + " Total quantity available " + quantity;
    }

    public String getDetails() {
        return "Product type is " + type + ", product price is " + price + " ,product description (" + description
                + ")";
    }

    public abstract void showDetails();
}
