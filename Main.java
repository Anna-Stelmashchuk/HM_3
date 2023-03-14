import account.CreditAccount;
import account.DebtiAccount;
import bank.Bank;
import user.BankClient;
import account.Account;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Bank privatBank = new Bank("Privat Bank", "ghshghgts");
        Bank monobank = new Bank("Monobank", "ljhjshjsrs");

        BankClient Kostya = new BankClient(1111, "Kostya", 20, "kostya@gmail.com", "+3801111111", "ghshgshgi", "Lychakivska 69");
        BankClient Alex = new BankClient(2222, "Alex", 17, "alex@gmail.com", "+3802222222", "jsgsghk", "Bandery 69");
        BankClient Daniel = new BankClient(3333, "Daniel", 21, "daniel@gmail.com", "+3803333333", "ghshgshgi", "Lysenka 69");
        BankClient Anna = new BankClient(4444, "Anna", 18, "anna@gmail.com", "+3804444444", "hgshisl", "Doroshenka 69");
        BankClient Daryna = new BankClient(5555, "Daryna", 17, "daryna@gmail.com", "+3805555555", "ghshgshgi", "Shukhevycha 69");
        BankClient Julia = new BankClient(1111, "Julia", 34, "julia@gmail.com", "+3806666666", "kdhgidhgidhil", "Vokzalna 69");

        CreditAccount account1 = new CreditAccount("1", 3214.5, Kostya, privatBank, 50000.0);
        CreditAccount account2 = new CreditAccount("2", 43683.0, Alex, privatBank, 100000.0);
        CreditAccount account3 = new CreditAccount("3", 57730.5, Daniel, monobank, 200000.0);
        CreditAccount account4 = new CreditAccount("4", 75693.5, Anna, privatBank, 200000.0);
        DebtiAccount account5 = new DebtiAccount("5", 43799.0, Daryna, monobank);
        DebtiAccount account6 = new DebtiAccount("6", 12000.0, Julia, monobank);

        privatBank.addAccount(account1);
        privatBank.addAccount(account2);
        privatBank.addAccount(account4);
        monobank.addAccount(account3);
        monobank.addAccount(account5);
        monobank.addAccount(account6);

        privatBank.removeAccount(account2);

        privatBank.getMoneyAmountInfo();

        Bank.getTotalAmountOfAccounts();

        account1.withdraw(10.0);

    }
}