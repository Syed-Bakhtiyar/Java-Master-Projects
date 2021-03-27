package object_oriented_programming_1.bank_account;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123 123 123 123", 3000, "Bakhtiyar", "bakhtiyar@g.com", "03462597420");
        System.out.println("Name: " + bankAccount.getCustomerName());

        bankAccount.withDrawal(100.00);

        bankAccount.deposit(50.00);
        bankAccount.withDrawal(100.00);

        bankAccount.deposit(51.0);
        bankAccount.withDrawal(100.00);

    }
}
