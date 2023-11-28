package BankFacade;

public class BankAccount {
        private int accountNumber;
        private double balance;

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Пополнил " + amount);
        }

        public void transfer(BankAccount receiver, double amount) {
            if (balance >= amount) {
                balance -= amount;
                receiver.deposit(amount);
                System.out.println("Перевел " + amount + " " + receiver.accountNumber);
            } else {
                System.out.println("Недостаточно средств");
            }
        }
}
