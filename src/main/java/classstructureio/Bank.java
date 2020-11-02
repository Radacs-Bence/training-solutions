package classstructureio;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1122-2323-4334", "Gipsz Jakab",90000);
        BankAccount account2 = new BankAccount("9123-9132-9231", "Mákos Huba",20000);
        System.out.println("1. számla: " + account1.getInfo() + "\r\n" + "2. számla: " + account2.getInfo());
        account1.deposit(30000);
        account2.withdraw(80000);
        System.out.println("Letét és kivétel:" + "\r\n" + "1. számla: " + account1.getInfo() + "\r\n" + "2. számla: " + account2.getInfo());
        account1.transfer(account2, 90000);
        System.out.println("Átutalás:"+ "\r\n" +"1. számla: " + account1.getInfo() + "\r\n" + "2. számla: " + account2.getInfo());
    }
}
