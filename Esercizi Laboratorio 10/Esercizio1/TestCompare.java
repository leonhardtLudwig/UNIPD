package Esercizio1;

import Esercizio1.BankAccount;
import java.util.Random;

public class TestCompare {

    private static Random r = new Random();

    public static void main(String args[]) {
        BankAccount[] accs = new BankAccount[10];
        for (int i = 0; i < accs.length; i++) {
            accs[i] = new BankAccount(r.nextInt(100) + 1);
        }
        for (BankAccount bankAccount : accs) {
            System.out.print(bankAccount.getBalance() + " ");
        }
        System.out.println();

        // selection
        System.out.println("Selection Sort");
        ArrayAlgorithms.selectionSort(accs);
        for (BankAccount bankAccount : accs) {
            System.out.print(bankAccount.getBalance() + " ");
        }
        ArrayAlgorithms.shuffle(accs);
        System.out.println();

        // merge
        System.out.println("Merge Sort");
        ArrayAlgorithms.mergeSort(accs);
        for (BankAccount bankAccount : accs) {
            System.out.print(bankAccount.getBalance() + " ");
        }
        System.out.println();

        ArrayAlgorithms.shuffle(accs);

        // insertion
        System.out.println("Insertion Sort");
        ArrayAlgorithms.insertionSort(accs);
        for (BankAccount bankAccount : accs) {
            System.out.print(bankAccount.getBalance() + " ");
        }
        System.out.println();

        System.out.println();

    }
}
