import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseTracker tracker = new ExpenseTracker();

        while (true) {

            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    double income = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String incomeCategory = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String incomeDescription = sc.nextLine();

                    tracker.addTransaction(new Transaction("Income", income, incomeCategory, incomeDescription));
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double expense = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String expenseCategory = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String expenseDescription = sc.nextLine();

                    tracker.addTransaction(new Transaction("Expense", expense, expenseCategory, expenseDescription));
                    break;

                case 3:
                    tracker.viewTransactions();
                    break;

                case 4:
                    System.out.println("Current Balance: ₹" + tracker.getBalance());
                    break;

                case 5:
                    System.out.println("Thank you for using Expense Tracker!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}