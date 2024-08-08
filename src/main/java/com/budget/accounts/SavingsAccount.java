package com.budget.accounts;

import java.math.BigDecimal;

public class SavingsAccount extends Accounts {

    public SavingsAccount(BigDecimal initialBalance) {
         this.balance = initialBalance;
    }




    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal(101);
        SavingsAccount test = new SavingsAccount(amount);
        test.getBalance();
        test.getBalance();
    }
}

