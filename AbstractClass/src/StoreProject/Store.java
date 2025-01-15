package AbstractClass.src.StoreProject;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForStoreAbstract product) {
}

public class Store {
    private static ArrayList<ProductForStoreAbstract> items = new ArrayList<>();

    public static void main(String[] args) {

        items.add(new Book("Life in see", 550, "This is a book written in see"));
        items.add(new Copy("classmate", 40, "Recycled"));
        items.add(new Pen("Parker", 100, " ball pen"));

        productList();

    }

    public static void productList() {
        for (var product : items) {
            product.showDetails();
            System.out.println("-".repeat(30));

        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,int quantity){

        order.add(new OrderItem(quantity, items.get(orderIndex)));

    }
}
