public class Main {

    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount();
        myBankAccount.setAccountNumber(98765000);
        System.out.println(myBankAccount.getAccountNumber());
        myBankAccount.setCustomerName("Coby Jenkins");
        System.out.println(myBankAccount.getCustomerName());
        myBankAccount.setBalance(200);
        System.out.println(myBankAccount.getBalance());
        myBankAccount.setEmailAddress("this@email.com");
        System.out.println(myBankAccount.getEmailAddress());
        myBankAccount.setPhoneNumber("602-555-1234");
        System.out.println(myBankAccount.getPhoneNumber());

        myBankAccount.withdrawFunds(300);
        System.out.println(myBankAccount.getBalance());
        myBankAccount.depositFunds(500);
        myBankAccount.withdrawFunds(300);
        System.out.println(myBankAccount.getBalance());

        VipCustomer notMe = new VipCustomer();
        System.out.println(notMe.getName());
        System.out.println(notMe.getCeditLimit());
        System.out.println(notMe.getEmailAddress());

        VipCustomer alsoNotMe = new VipCustomer("Jane Doe", "goodluckwiththat@example.com");
        System.out.println(alsoNotMe.getName());
        System.out.println(alsoNotMe.getCeditLimit());
        System.out.println(alsoNotMe.getEmailAddress());



    }

    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

}
