package com.budget.transactions;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.budget.accounts.Accounts;

/* this class will take an external expense and process the transaction applying any changes to the account.

 */

public class ExternalExpense implements transactional{

    BigDecimal amount;
    Accounts currentAccount;

    @Override
    public LocalDateTime dateOfTransaction() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dtf.format(now);
        return now;
    }

    @Override
    public Boolean validTransaction(Accounts account, BigDecimal amount) {
        BigDecimal temp = account.getBalance().subtract(amount);
        BigDecimal test = new BigDecimal("0");

        return temp.compareTo(test) >= 0;
    }
    public ExternalExpense(Accounts account, BigDecimal amount) {
        this.amount = amount;
        this.currentAccount = account;

    }

    public void processExpense() {
        Boolean valid = this.validTransaction(currentAccount, amount);
        if (valid) {
            currentAccount.setBalance(currentAccount.getBalance().subtract(amount));
        } else {
            throw new ArithmeticException("Account balance invalid for this transaction");
        }
    }
}
