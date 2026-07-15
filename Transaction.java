public class Transaction {

    String type;
    double amount;
    String category;
    String description;

    public Transaction(String type, double amount, String category, String description) {
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return type + " | ₹" + amount + " | " + category + " | " + description;
    }
}