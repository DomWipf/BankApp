
import java.util.Scanner;
import java.util.regex.Pattern;
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
    double balance = 0.0;


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
        return this.balance;
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
    @Override
    public String toString() {
        return "ID: "+this.Id+"\nFirst Name: "+this.firstName+"\nLast Name: "+this.lastName;
    }

}
/**
 * The Bank App. Used to test the Account class.
 *
 * @author dejohns2
 * @version beta 0.1
 * @since 2025.02.09
 */
public class BankApp {
    /**
     * Scanner for all user input.
     */
    private static final Scanner sc = new Scanner(System.in);
    /**
     * Standard double dash line for display output.
     */
    private static final String DOUBLE_DASH_LINE = String.format("%80s",
            "").replace(' ', '=');
    /**
     * Standard single dash line for display output.
     */
    private static final String SINGLE_DASH_LINE = DOUBLE_DASH_LINE.replace('=',
            '-');

    /**
     * Display the Bank App program header.
     */
    private static void displayAppHeader() {
        System.out.println(DOUBLE_DASH_LINE);
        System.out.println("Welcome to the Bank App!");
        System.out.println(DOUBLE_DASH_LINE);
        System.out.println();
    }

    /**
     * Validate the user's input for first and last name and create an account.
     *
     * @return The newly created account with the first and last name set.
     */
    private static Account createAccount() {
        String firstName;
        String lastName;
        while (true) {
            System.out.print("What is your first name? ");
            firstName = sc.nextLine();
            System.out.print("What is your last name? ");
            lastName = sc.nextLine();
            System.out.println();
            try {
                Account account = new Account(firstName, lastName);
                System.out.println(SINGLE_DASH_LINE);
                System.out.println("Account create! " + account);
                return account;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again.");
            }
        }
    } // end createAccount

    /**
     * Validate that the user's input is a valid currency amount up to 2 decimal
     * positions
     *
     * @param input User's input.
     * @return True is valid, and False if invalid currency entered
     */
    public static boolean isValidMoney(String input) {
        return Pattern.matches("^\\d+(\\.\\d{1,2})?$", input);
    }

    /**
     * Prompt the user for a double value
     *
     * @param prompt Input label to display
     * @return User input as a double
     */
    private static double getAmount(String prompt) {
        String userInput;
// keep looping until valid input
        while (true) {
            try {
                System.out.print(prompt);
                userInput = sc.nextLine();
                if (isValidMoney(userInput)) {
                    return Double.parseDouble(userInput);
                } else {
                    throw new IllegalArgumentException("Invalid input.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + " Please try again...");
            }
        } // end of validation while loop
    } // end of getDouble method

    /**
     * Make a deposit into the account.
     *
     * @param account The account to make a deposit for.
     */
    private static void makeDeposit(Account account) {
        double amount = getAmount("What amount would you like to deposit? ");
        try {
            account.deposit(amount);
            System.out.print("Deposit successful! ");
            System.out.printf("Current balance: %,.2f\n", account.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } // end of makeDeposit

    /**
     * Make a withdrawal from the account.
     *
     * @param account The account to make a withdrawal from.
     */
    private static void makeWithdrawal(Account account) {
        double amount = getAmount("What amount would you like to withdraw? ");
        try {
            account.withdrawal(amount);
            System.out.print("Withdrawal successful! ");
            System.out.printf("Current balance: %,.2f\n", account.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // end
    }
    /**
     * Runs the Bank App
     * @param args N/A
     */
    public static void main(String[] args) {
        displayAppHeader();
        Account account = createAccount();
        label:
        while (true){
            System.out.println(SINGLE_DASH_LINE);
            System.out.println();
            System.out.print("Enter D=Deposit, W=Withdrawal, Q=Quit: ");
            String option = sc.nextLine().toLowerCase();
            switch (option) {
                case "q":
                case "quit":
                    break label;
                case "d":
                case "deposit":
                    makeDeposit(account);
                    break;
                case "w":
                case "withdrawal":
                    makeWithdrawal(account);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            System.out.println();
        }
    } // end of main
} // end of BankApp class

