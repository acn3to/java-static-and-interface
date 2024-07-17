package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final List<BankAccount> accounts = new ArrayList<>();

    public static BankAccount openAccount(String accountNumber, String accountHolder, double initialBalance) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.add(newAccount);
        return newAccount;
    }

    public static void closeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
                accounts.remove(i);
                break;
            }
        }
    }

    public static void deposit(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                break;
            }
        }
    }

    public static boolean withdraw(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account.withdraw(amount);
            }
        }
        return false;
    }

    public static boolean transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        for (BankAccount accountFrom : accounts) {
            if (accountFrom.getAccountNumber().equals(fromAccountNumber)) {
                if (!accountFrom.withdraw(amount)) {
                    return false;
                }
            }
        }
        for (BankAccount accountTo : accounts) {
            if (accountTo.getAccountNumber().equals(toAccountNumber)) {
                accountTo.deposit(amount);
                return true;
            }
        }
        return false;
    }

    public static void listAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account.toString());
        }
    }
}
