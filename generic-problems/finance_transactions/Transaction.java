package finance_transactions;

public class Transaction{
    private String id;
    private String type;
    private double amount;
    private String date;

    public Transaction(String id, String type, double amount, String date) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format(
                "Transaction{id='%s', type='%s', amount=%.2f, date='%s'}",
                id, type, amount, date
        );
    }
}  