class BankAccount {
    private double bal;
    
    public BankAccount(double initialBalance) {
        this.bal = initialBalance;
    }
    
    public double getBalance() {
        return bal;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("Deposit successful. New balance: " + bal);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= bal) {
            bal -= amount;
            System.out.println("Withdrawal successful. New balance: " + bal);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}
    
    // represent the ATM machine
class ATM {
    private ATM_Machine acc;
    
    public ATM(ATM_Machine acc) {
        this.acc = acc;
    }
    
    public void showMenu() {
            System.out.println("\n\tWelcome to the ATM!");
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
    }
    
    public void checkBalance() {
        System.out.println("\nYour balance is: " + acc.getBalance());
    }
    
    public void deposit(double amount) {
        acc.deposit(amount);
    }
    
    public void withdraw(double amount) {
        acc.withdraw(amount);
    }
}
    
    // Main class to run the ATM
public class ATM_Machine {
    public static void main(String[] args) {
        ATM_Machine account = new ATM_Machine(); // Initial balance
        ATM atm = new ATM(account);
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            atm.showMenu();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
        
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("\nEnter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("\nEnter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    exit = true;
                    System.out.println("\n\tThank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("\n\tInvalid option. Please try again.");

            }
            System.out.println("\n\t------******------");

        }

        scanner.close();
    }

    public String getBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }

    public void withdraw(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    public void deposit(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
}
    