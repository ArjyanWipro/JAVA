public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount arjyan = new BankAccount();
        //Creating a instance using constructor.
        BankAccount bobsAccount=new BankAccount(3890134890l,25000,"BOB","bob@wipro",8598833797l);

        // arjyan.setAccountNumber(3890134890l);
        // arjyan.setAccountBalance(25000);
        // arjyan.setCustomerName("ARJYAN");
        // arjyan.setEmail("arjyan@wipro");
        // arjyan.setPhoneNumber(8598833797l);

        bobsAccount.depositingFunds(3904);
        bobsAccount.withdrawingFunds(1000);
        bobsAccount.withdrawingFunds(2500.49);
        bobsAccount.depositingFunds(5000);
        bobsAccount.depositingFunds(20020);

        arjyan.withdrawingFunds(35);

        // System.out.println("Customer name is "+arjyan.getCustomerName());
        // System.out.println("Account number is "+arjyan.getAccountNumber());
        // System.out.println("Account balance is "+arjyan.getAccountBalance()+"/-");
        // System.out.println("Email address "+arjyan.getEmail());
        // System.out.println("phone number "+arjyan.getPhoneNumber());

    }
}