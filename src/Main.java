public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(122204, "Nurzhibek");
        account.deposit(3000);
        account.withdraw(440);
        account.deposit(750);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("\nTransaction History:");
        account.printHistory();
    }
}