package com.budget.accounts;

import java.math.BigDecimal;

public abstract class Accounts {
    BigDecimal balance;

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal newAmount) {
        this.balance = newAmount;
    }
}
