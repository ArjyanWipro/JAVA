package AutoBoxing.BankingProject;
import java.util.*;
public class Bank{
    private static ArrayList<Customer> customersName= new ArrayList<>();
    public static void main(String[] args) {
        Customer arjyan= new Customer("Arjyan", 189);
        customersName.add(arjyan);

        Customer rajesh= new Customer("Rajesh", 756);
        customersName.add(rajesh);

        Customer santosh= new Customer("Santosh", 268);
        customersName.add(santosh);

        Customer aditya= new Customer("Aditya", 560);
        customersName.add(aditya);

        alterMoney(300, arjyan);

    }

    public static void addCustomer(Customer customer){
        for(var allCustomer:customersName){
            if (allCustomer.getName().equalsIgnoreCase(customer.getName())) {
                System.out.println("user already present");
                return;
            }
            else{
                customersName.add(customer);
            }

        }
    }
    public static void alterMoney(double amount, Customer customer){
        for(var allCustomer : customersName) {
            if (allCustomer.getName().equalsIgnoreCase(customer.getName())) {
                allCustomer.setTransaction(Double.valueOf(amount));
                System.out.println(customer);
                return;
            }
        }
                System.out.println("User not found to add amount!");
                return;
            }
    }
