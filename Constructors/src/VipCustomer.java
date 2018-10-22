public class VipCustomer {

    private String name;
    private double ceditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("John Doe", 0.00, "default@example.com");
        System.out.println("Empty constructor");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 0.00, emailAddress);
        System.out.println("Partial empty constructor");
    }

    public VipCustomer(String name, double ceditLimit, String emailAddress) {
        this.name = name;
        this.ceditLimit = ceditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCeditLimit() {
        return ceditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.
