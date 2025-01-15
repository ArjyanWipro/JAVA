package AutoBoxing.BankingProject;

import java.util.*;

public class Customer {

    private String name;
    private ArrayList<Double> transaction = new ArrayList<>();

    public Customer(String name, double transaction) {
        this.name = name;
        this.transaction.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransaction(double transaction) {
        this.transaction.add(transaction);
    }

    public String toString() {
        return "Name= " + getName() + " Transactions= " + getTransaction();
    }
}