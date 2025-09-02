package finance_transactions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TransactionValidator {
    public static boolean isValid(Transaction t) {
        if (t.getId() == null || t.getId().isEmpty()) return false;

        if (!t.getType().matches("deposit|withdrawal|payment")) return false;

        if (t.getAmount() <= 0) return false;

        try {
            LocalDate.parse(t.getDate(), DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (DateTimeParseException e) {
            return false;
        }

        return true;
    }
}
