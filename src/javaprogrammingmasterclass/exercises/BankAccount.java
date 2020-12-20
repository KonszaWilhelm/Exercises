package javaprogrammingmasterclass.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private long accountNumber;
    private BigDecimal balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        System.out.println(balance.setScale(2, RoundingMode.HALF_UP));
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double depositSum){
        BigDecimal depSum = new BigDecimal(depositSum);
        balance = balance.add(depSum);
    }
    public void withdraw(BigDecimal withdrawSum){
        balance.subtract(withdrawSum);
    }

    public BankAccount(long balance) {
    this.balance = BigDecimal.valueOf(balance);
    }
}
