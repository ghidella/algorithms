package finance_transactions;

// program execution
public class Main {
    public static void main(String[] args) {
        // input
        Transaction[] transactions = new Transaction[] {
                new Transaction("1", "deposit", 150.75, "2025-08-01"),
                new Transaction("2", "withdrawal", 50.00, "2025-08-02"),
                new Transaction("3", "payment", 750.00, "2025-08-03"),
                new Transaction("4", "deposit", 200.00, "2025-08-04"),
                new Transaction("5", "deposit", 12500.00, "2025-08-05"),
                new Transaction("6", "withdrawal", 15000.50, "2025-08-06"),
                new Transaction("", "deposit", 100.00, "2025-08-07"),
                new Transaction("8", "transferencia", 250.00, "2025-08-08"),
                new Transaction("9", "payment", -50.00, "2025-08-09"),
                new Transaction("10", "withdrawal", 0, "2025-08-10"),
                new Transaction("11", "deposit", 100, "2025-08-11"),
                new Transaction("12", "payment", 300.00, "2025/08/12"),
                new Transaction("13", "payment", 400.00, "2025-13-01"),
                new Transaction("14", "deposit", 500.00, "2025-08-32"),
                new Transaction("15", "deposit", 500.00, "2025-02-29"),
                new Transaction("16", "deposit", 500.00, "2025-02-30")
        };


        System.out.println(TransactionProcessor.processTransactions(transactions).toString());
    }
}
