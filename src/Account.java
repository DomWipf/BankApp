/**
 * The Account class. Used to create the Account class.
 * @author Brock Koranda Dom Wipf
 * @version beta 0.1
 * @since 2025.02.10
 */

public class Account {
    private static int lastId = 0;
    private final int Id;
    String firstName = "?";
    String lastName = "?";
    double balance = 0;

    public Account() {
        this.Id = ++lastId;
        this.firstName = "";
        this.lastName = "";
        this.balance = 0.0;
    }
    public Account(String firstName, String lastName) {
        this.Id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = 0.0;
    }
    public double getBalance() {
        return balance;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}