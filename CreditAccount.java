package account;

import bank.Bank;
import user.BankClient;

public class CreditAccount extends  Account{
    private Double accountLimit;

    public CreditAccount(String accountNumber, Double accountBalance, BankClient user, Bank bank, Double accountLimit) {
        super(accountNumber, accountBalance, user, bank);
        if (user.getAge() < 18) {
            this.accountLimit = 100.0;
        }
        this.accountLimit = 10000.0;
    }

    @Override
    public void withdraw(Double amount) {
        System.out.println("commission of credit account withdraw is 10 percent and you will get an amount that is less than 10 percent and value " + (amount - (amount * 0.1)));
    }
}
