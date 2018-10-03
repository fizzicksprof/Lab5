import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * checkings account
         */
        CHECKINGS,
        /**
         * savings account
         */
        SAVINGS,
        /**
         * student account
         */
        STUDENT,
        /** workplace account
         *
         */
        WORKPLACE
    }

    /**
     * the bank account number
     */
    private int accountNumber;
    /**
     * the type of bank account
     */
    private BankAccountType accountType;
    /**
     * the balance of the bank account
     */
    private double accountBalance;
    /**
     * the owner of the bank account
     */
    private String ownerName;
    /**
     * the interest rate for the bank account
     */
    private double interestRate;
    /** the interest earned for the bank account
     *
     */
    private double interestEarned;

    /**
     * the bank account constructor with parameters
     * @param name - name of the bank account owner
     * @param accountCategory - name of the account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    ownerName = name;
    accountType = accountCategory;

    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * getter for the bank account balance
     * @return
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * sets the bank account balance
     * @return - the new account balance
     */
    public setAccountBalance(final double accountBalance) {

    }

    /**
     * gives the account number
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }
}
