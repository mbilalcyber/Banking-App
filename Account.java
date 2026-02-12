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



    public Account() {

        this.id = ++lastId;
        this.firstName = "";
        this.lastName = "";
        this.balance = 0.0;
    }

    /**
     *The overload constructor calls the default constructor and then allows overriding the default values for the
     * account owners name for calling the setter for data validation.
     * @param firstName - Account Owners first name
     * @param lastName  - Account Owners last name
     */

    public Account(String firstName, String lastName) {

        this();
        setFirstName(firstName);
        setLastName(lastName);

    }

}
