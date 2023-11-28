import BankFacade.BankFacade;

public class Main {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade(123456, 1000.0);

        bank.deposit(500);
        bank.transfer(789012, 300);
        System.out.println("Баланс: " + bank.getAccountBalance());
    }
}
