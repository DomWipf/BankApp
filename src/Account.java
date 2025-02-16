
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * The Account class. Used to create the Account class.
 * @author Brock Koranda Dom Wipf
 * @see <a href="https://github.com/DomWipf/BankApp">...</a>
 * @version beta 0.1
 * @since 2025.02.10
 */
public class Account {
    private static int lastId = 0;
    private final int Id;
    String firstName = "?";
    String lastName = "?";
    double balance = 0.0;


    public Account() {
        this.Id = ++lastId;
        this.firstName = "";
        this.lastName = "";
        this.balance = 0.0;
    }
    public Account(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /**
     * gets user balance and returns it
     * @return balance of the users account
     */
    public double getBalance() {
        return this.balance;
    }
    /**
     * to get name from user
     * @param firstName last name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * to get name from user
     * @param lastName last name of the user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * gets a positive number from user and adds it to account amount
     * @param amount you want to deposit into your account
     */
    public void deposit(double amount) {
        this.balance += amount;
    }
    /**
     * throws error if amount is too large for the account
     * @param amount you want to withdrawl from your account
     */
    public void withdrawal(double amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient Funds! ");
        }
        else {
            this.balance -= amount;
        }
    }
    @Override
    public String toString() {
        return "ID: "+this.Id+"\nFirst Name: "+this.firstName+"\nLast Name: "+this.lastName;
    }

}

