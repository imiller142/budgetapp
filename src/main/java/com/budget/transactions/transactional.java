package com.budget.transactions;

import com.budget.accounts.Accounts;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

// this will process transactions
public interface transactional {
    public Boolean validTransaction(Accounts account, BigDecimal amount);
    public LocalDateTime dateOfTransaction();
}
