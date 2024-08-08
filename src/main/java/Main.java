import com.budget.accounts.SavingsAccount;
import com.budget.transactions.ExternalExpense;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
         BigDecimal amount = new BigDecimal(100);
         BigDecimal biggerAmount = new BigDecimal(2000);
        SavingsAccount test = new SavingsAccount(amount);
        ExternalExpense expense = new ExternalExpense(test, amount);
        System.out.println(test.getBalance());
        expense.processExpense();
        System.out.println(test.getBalance());
        expense.processExpense();


    }
}
