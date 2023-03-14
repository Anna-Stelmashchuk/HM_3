package account;

import bank.Bank;
import user.BankClient;

public class DebtiAccount extends Account{
    public DebtiAccount(String accountNumber, Double accountBalance, BankClient user, Bank bank) {
        super(accountNumber, accountBalance, user, bank);
    }

    @Override
    public void withdraw(Double amount) {
        System.out.println("You will get money without any commission: " + amount);
    }
}
