import java.util.ArrayList;

public class ExpenseTracker {

    ArrayList<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Transaction added successfully!");
    }

    public void viewTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        System.out.println("\n----- Transaction History -----");
        for (Transaction t : transactions) {
            System.out.println(
                    t.type + " | ₹" + t.amount + " | " + t.category + " | " + t.description);
        }
    }

    public double getBalance() {

        double balance = 0;

        for (Transaction t : transactions) {

            if (t.type.equalsIgnoreCase("Income")) {
                balance += t.amount;
            } else {
                balance -= t.amount;
            }
        }

        return balance;
    }
}