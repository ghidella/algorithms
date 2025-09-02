package finance_transactions;

import java.util.*;

public class TransactionProcessor {

    public static Map<String, Object> processTransactions(Transaction[] transactions) {
        double totalValidAmount = 0;
        Map<String, Map<String, Object>> consolidatedTypes = new HashMap<>();
        List<Transaction> invalidTransactions = new ArrayList<>();
        List<String> suspiciousTransactions = new ArrayList<>();

        for (Transaction t : transactions) {
            if (!TransactionValidator.isValid(t)) {
                invalidTransactions.add(t);
                continue;
            }

            // total sum
            totalValidAmount += t.getAmount();

            // type consolidation
            consolidatedTypes.putIfAbsent(t.getType(), new HashMap<>());
            Map<String, Object> typeData = consolidatedTypes.get(t.getType()); // transaction type map

            double sum = (double) typeData.getOrDefault("totalSum", 0.0);
            int qty = (int) typeData.getOrDefault("quantity", 0);

            typeData.put("totalSum", sum + t.getAmount());
            typeData.put("quantity", qty + 1);

            // fraud
            if (t.getAmount() > 10000) {
                suspiciousTransactions.add(t.getId());
            }
        }

        // final result
        Map<String, Object> result = new HashMap<>();
        result.put("totalValidAmount", totalValidAmount);
        result.put("consolidatedTypes", consolidatedTypes);
        result.put("invalidTransactions", invalidTransactions);
        result.put("suspiciousTransactions", suspiciousTransactions);

        return result;
    }
}
