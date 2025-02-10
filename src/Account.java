/**
 * The Account class. Used to create the Account class.
 * @author Brock Koranda Dom Wipf
 * @version beta 0.1
 * @since 2025.02.10
 */

public class Account {
    String firstName = "?";
    String LastName = "?";
    double balance = 0;
    public Account(String firstName,String lastName) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.balance = 0;
    }
    public double getBalance() {
        return balance;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}