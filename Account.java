public class Account {

    /**
     * Class variable for maintaining the last account used.
     */
    private static int lastId = 0;

    /**
     * The unique account number used by the default account number.
     */

    private final int id = 0;  //

    private String firstName;

    private String lastName;

    private double balance;


    /**
     *
     */
    public Account() {

        this.id = ++lastId;
        this.firstName = "";
        this.lastName = "";
        this.balance = 0.0;
    }

    /**
     * The overload constructor calls the default constructor and then allows overriding the default values for the
     * account owners name for calling the setter for data validation.
     *
     * @param firstName - Account Owners first name
     * @param lastName  - Account Owners last name
     */

    public Account(String firstName, String lastName) {

        this();
        setFirstName(firstName);
        setLastName(lastName);

    }

    /**
     *Allow retrieval of the current amount balance
     * @return
     */
    public double getBalance() {

        return this.balance;
    }

    /**
     * Allows setting the account owners first name but only if it's not blank.
     * @param firstName
     */

    public void setFirstName(String firstName) {

        if (firstName == null || firstName.trim().isEmpty()) {

            throw new IllegalArgumentException("First Name Can't be Empty" + id);

        }
        this.firstName = firstName;
    }

    /**
     * Allow setting of the account owners last name.
     * @param lastName
     */
    public void setLastName(String lastName) {

        if (lastName == null || lastName.trim().isEmpty()) {

            throw new IllegalArgumentException("Last Name Can't be Empty" + id);

        }
        this.lastName = lastName;
    }

    /**
     * Allows making a deposit for amounts greater than zero.
     * @param amount
     */
    public void deposit(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException("Account Balance Can't be less than 0");
        }
        this.balance += amount;


    }

    /**
     *Allows making a deposit for amounts greater than zero and NOT greater than the account balance.
     * @param amount
     */
    public void withdrawl(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException("Invalid Amount");
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("Invalid Amount");
        }
        this.balance -= amount;


    }


    /**
     * General account information (id and name) as a string.
     * @return formatted account text
     */
    public String toString() {
        return "ID#: " + this.id + " | Name: " + this.firstName + " " + this.lastName;
    }


}
