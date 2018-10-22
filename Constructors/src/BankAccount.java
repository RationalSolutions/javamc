public class BankAccount {

    private double accountNumber, balance;
    private String customerName, emailAddress, phoneNumber;

    public BankAccount(double accountNumber, double balance, String customerName, String emailAddress,
            String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String emailAddress, String phoneNumber) {
        this(000000, 100.75, customerName, emailAddress, phoneNumber);
    }

    public BankAccount() {
        this(123456789, 0.00, "customer", "goodluckwiththat@parchmentcom", "999-555-1234");
        System.out.println("Empty constructor");
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void withdrawFunds(double withdrawal) {
        if ((this.balance - withdrawal) >= 0) {
            this.balance -= withdrawal;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

/*
 Create a new class for a bank account
 Create fields for the account number, balance, customer name, email and phone number.

 Create getters and setters for each field
 Create two additional methods
 1. To allow the customer to deposit funds (this should increment the balance field).
 2. To allow the customer to withdraw funds. This should deduct from the balance field,
 but not allow the withdrawal to complete if their are insufficient funds.
 You will want to create various code in the Main class (the one created by IntelliJ) to
 confirm your code is working.
 Add some System.out.println's in the two methods above as well.
 */
