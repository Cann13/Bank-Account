public class BankAccount {
    private int accountNumber;
    private double balance;
    final int OVER_DRAFT_FEE = 35;
    
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        this.balance = getBalance() + amount;
    }
    
    public void withdraw(int amount) {
        if (getBalance() >= amount) {
            balance = getBalance() - amount;
        }
        
        else {
            balance = getBalance() - amount - 35;
        }
    }
    
    public void transfer(int amount, BankAccount account) {
        account.deposit(amount);
        withdraw(amount);
    }
}