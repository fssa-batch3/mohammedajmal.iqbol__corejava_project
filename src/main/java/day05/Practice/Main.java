package day05.Practice;

public class Main {
    public static void main(String[] args) {
        Account axisAccount = new Account("AX001", 6000);
        ATM axisATM = new AxisATM();

        System.out.println("Initial balance: " + axisAccount.getBalance());

        try {
            axisATM.withdraw(axisAccount, 2000);
            System.out.println("Withdrawal successful. Current balance: " + axisAccount.getBalance());
        } catch (Exception e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        axisATM.deposit(axisAccount, 1000);
        System.out.println("Deposit successful. Current balance: " + axisAccount.getBalance());

        Account iciciAccount = new Account("IC001", 12000);
        ATM iciciATM = new IciciATM();

        System.out.println("Initial balance: " + iciciAccount.getBalance());

        try {
            iciciATM.withdraw(iciciAccount, 5000);
            System.out.println("Withdrawal successful. Current balance: " + iciciAccount.getBalance());
        } catch (Exception e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        iciciATM.deposit(iciciAccount, 2000);
        System.out.println("Deposit successful. Current balance: " + iciciAccount.getBalance());
    }
}