public class bankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount() {
        this(145, 2500, "Default name", "Default email", "Default phone number");
        System.out.println("It is an empty constructor");
    }

    public bankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public bankAccount(String customerName, String email, String phoneNumber) {
        this(123456789, 100, customerName, email, phoneNumber);
    }

    // set
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // get
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // two methods for deposits and withdraw

    public double deposit(double cashDeposit) {
        this.balance = this.balance + cashDeposit;
        System.out.println("New balance is: " + this.balance);
        return this.balance;
    }

    public double withdraw(int cashWithdraw) {

        if (cashWithdraw > this.balance) {
            System.out.println("Sorry your withdrawing more then the balance of your account. Max withdraw = " + this.balance + ". Withdraw not processed.");
            return this.balance;
        } else {
            this.balance = this.balance - cashWithdraw;
            System.out.println("Withdraw: " + cashWithdraw + ". New balance is: " + this.balance);
            return this.balance;
        }
    }
}



