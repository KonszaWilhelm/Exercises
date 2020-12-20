package javaprogrammingmasterclass.exercises;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("Default Name", 999999, "Default Email");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "Default Email in constructor with 2 param");

    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
