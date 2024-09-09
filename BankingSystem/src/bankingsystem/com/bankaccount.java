package bankingsystem.com;

public class bankaccount {
	private double balance;

    public bankaccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void viewBalance() {
        if (banklogin.getInstance().isLoggedIn()) {
            System.out.println("Current balance: $" + balance);
        }
    }
    public void deposit(double amount) {
        if (banklogin.getInstance().isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } 
    }
    
    public void withdraw(double amount) {
        if (banklogin.getInstance().isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
            	System.out.println("Withdrew: $" + amount);
            	System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}

