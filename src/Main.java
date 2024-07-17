import bank.Bank;
import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = Bank.openAccount("123456", "Arnaldo Neto", 1000.00);
        System.out.println("Conta aberta com sucesso: " + myAccount);

        Bank.deposit("123456", 500.00);
        System.out.println("Depósito realizado com sucesso. Saldo atualizado: " + myAccount.getBalance());

        boolean success = Bank.withdraw("123456", 200.00);
        System.out.println((success ? "Saque realizado com sucesso. Saldo atualizado: " + myAccount.getBalance() : "Não foi possível realizar o saque. Saldo insuficiente."));

        boolean transferSuccess = Bank.transfer("123456", "789012", 300.00);
        System.out.println((transferSuccess ? "Transferência realizada com sucesso. Saldo da conta de origem atualizado: " + myAccount.getBalance() : "Falha na transferência. Verifique os números das contas e o saldo disponível."));

        Bank.closeAccount("123456");
        System.out.println("Conta fechada com sucesso.");

        System.out.println("Contas bancárias abertas:");
        Bank.listAccounts();
    }
}