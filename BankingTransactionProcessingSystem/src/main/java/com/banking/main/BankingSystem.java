package com.banking.main;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.banking.service.BankAccount;
import com.banking.task.TransactionTask;

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Account Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        System.out.print("Enter Number of Transactions: ");
        int n = sc.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter withdrawal amount for Transaction " + i + ": ");
            double amount = sc.nextDouble();

            executor.execute(new TransactionTask(account, amount));
        }

        executor.shutdown();

        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("\nFinal Account Balance: Rs." + account.getBalance());

        sc.close();
    }
}
