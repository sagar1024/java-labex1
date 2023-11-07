public class FintechTransaction {

    // Data members of the Class

    public String username;
    public int user_age;
    public String course;

    private String senderAcc;
    private String receiverAcc;
    private int transactionId;
    private double amount;

    // Methods

    public static void showDetails(String name, int age) {
        System.err.println("Name of the user: " + name);
        System.out.println("The age of the user: " + age);
    }

    // Default constructor

    public FintechTransaction() {
        this.transactionId = 0000;
        this.senderAcc = "NA";
        this.receiverAcc = "NA";
        this.amount = 0.0;
    }

    // Parameterized constructor

    public FintechTransaction(int transactionId, String senderAcc, String receiverAcc, double amount) {
        this.transactionId = transactionId;
        this.senderAcc = senderAcc;
        this.receiverAcc = receiverAcc;
        this.amount = amount;
    }

    // Method to display transaction details

    public void displayTransactionDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Sender account: " + senderAcc);
        System.out.println("Receiver account: " + receiverAcc);
        System.out.println("Amount sent by the User: " + amount);
    }

    // Method overloading
    // Three different ways to update the transaction amount

    // Method 1
    public void updateAmount(double newAmount) {
        this.amount = newAmount;
    }

    // Method 2
    public void updateAmount(double newAmount, String transactionType) {
        if (transactionType == "deposit") {
            this.amount += newAmount;
        } else if (transactionType == "withdraw") {
            this.amount -= newAmount;
        }
    }

    // Method 3
    public void updateAmount(double newAmount, double fee) {
        this.amount = newAmount - fee;
    }

    // Constructor overloading

    // Constructor 1
    public FintechTransaction(String s, int n) {
        System.out.println("User's name and age: ");
        username = s;
        user_age = n;
    }

    // Constructor 2
    // public FintechTransaction()
    // {
    // username = "NA";
    // user_age = 0;
    // }

    // Constructor 3
    public FintechTransaction(String course) {
        this.course = "mca";
    }

    // Driver code

    public static void main(String[] args) {

        // Calling the method with arguments
        showDetails("sagar", 22);

        // Creating FintechTransaction objects(i.e transactions)

        // Using different constructors defined above
        // Object transaction1 for default constructor
        FintechTransaction transaction1 = new FintechTransaction();

        // Object transaction2 for parameterized constructor
        FintechTransaction transaction2 = new FintechTransaction(1250, "AccA", "AccB", 2000.00);

        // Displaying transaction details

        // For transaction 1
        System.out.println("Transaction 1 Details:");
        transaction1.displayTransactionDetails();

        // For transaction 2
        System.out.println("\nTransaction 2 Details:");
        transaction2.displayTransactionDetails();

        // Updating transaction amounts using method overloading

        transaction1.updateAmount(500.0);
        transaction2.updateAmount(500.00, "deposit");

        // Displaying updated transaction details

        System.out.println("\nTransaction 1 Details UPDATED:");
        transaction1.displayTransactionDetails();
        System.out.println("\nTransaction 2 Details UPDATED:");
        transaction2.displayTransactionDetails();

        // Displaying the user details using the constructor overloading

        System.out.println("\nUser Details using Constructor overloading: ");

        FintechTransaction transaction3 = new FintechTransaction("sagar", 22);
        FintechTransaction transaction4 = new FintechTransaction();
        FintechTransaction transaction5 = new FintechTransaction("mca");

        System.out.println(transaction3.username);
        System.out.println(transaction3.user_age);

        System.out.println(transaction4.username);
        System.out.println(transaction4.user_age);

        System.out.println(transaction5.course);
    }

}