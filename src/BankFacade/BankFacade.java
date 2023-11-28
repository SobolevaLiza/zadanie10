package BankFacade;

public class BankFacade {

    private BankAccount account;

    public BankFacade(int accountNumber, double balance) {
        this.account = new BankAccount(accountNumber, balance);
    }

    public double getAccountBalance() {
        return account.getBalance();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void transfer(int receiverAccountNumber, double amount) {
        BankAccount receiver = new BankAccount(receiverAccountNumber, 0);
        account.transfer(receiver, amount);
    }

}
