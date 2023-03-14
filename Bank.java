package bank;

import account.Account;


public class Bank {
    private String bankName;
    private String bankCode;
    private Double moneyAmount;
    private static int amountOfAccounts = 0;

    public Bank(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.moneyAmount = 4000.0;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public static int getAmountOfAccounts() {
        return amountOfAccounts;
    }

    public static void setAmountOfAccounts(int amountOfAccounts) {
        Bank.amountOfAccounts = amountOfAccounts;
    }

    public void addAccount(Account account) {
        amountOfAccounts++;
        moneyAmount += account.getAccountBalance();
        System.out.println("Account was added: " + account.getAccountNumber());
    }

    public void removeAccount(Account account) {
        if (account.getAccountBalance() > 0) {
            amountOfAccounts--;
            moneyAmount -= account.getAccountBalance();
            System.out.println("Account was removed: " + account.getAccountNumber());
        } else {
            System.out.println("Cannot remove account with negative balance.");
        }
    }

    public void getMoneyAmountInfo() {
        System.out.println("Total amount of money in : " + this.bankName + "is " + moneyAmount);
    }

    public static void getTotalAmountOfAccounts() {
        System.out.println("Total amount of accounts: " + amountOfAccounts);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}
