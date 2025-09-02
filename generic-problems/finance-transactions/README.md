# Financial Transactions Validation and Consolidation

## Scenario

You are working for a fintech that processes millions of transactions daily. Part of your job is to ensure data integrity and occasionally consolidate transactions of the same type.

## Problem

Implement a function called `processTransactions` that receives an array of `transactions`. Each `transaction` is an object with the following properties:

- `id` (string): Unique identifier of the transaction.
- `type` (string): The type of the transaction (e.g., "deposit", "withdrawal", "payment").
- `amount` (number): The value of the transaction.
- `date` (string): The date of the transaction in the format "YYYY-MM-DD".

The function must perform the following operations and return an object that consolidates the results:

### Transaction Validation

A transaction is valid if:

- `id` is not empty.
- `type` is one of the allowed types: "deposit", "withdrawal", "payment".
- `amount` is a positive number greater than 0.
- `date` is a valid date in the "YYYY-MM-DD" format (no need to check if the date exists on the calendar, just that it is parsable).

Invalid transactions should be ignored in the consolidation and counted in a list of `invalidTransactions`.

### Consolidation by Type

For each valid transaction type, calculate the `totalSum` of the amounts and the `quantity` of transactions of that type.

Store this information in a nested object.

### Suspicious Transactions (Fraud Detection)

Any valid transaction with an amount greater than R$ 10,000.00 should be flagged.

Create a list `suspiciousTransactions` containing the `ids` of these transactions.

### Return Structure

The returned object should have the following properties:

- `totalValidAmount` (number): The sum of all valid transaction amounts.
- `consolidatedTypes` (object): An object where the keys are transaction types (e.g., "deposit", "withdrawal") and the values are objects with `totalSum` (number) and `quantity` (number) for that type.
- `invalidTransactions` (array of objects): A list of transaction objects that did not pass validation.
- `suspiciousTransactions` (array of strings): A list of `ids` of valid transactions with high amounts.
