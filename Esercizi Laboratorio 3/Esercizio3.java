import java.util.Scanner;
import java.util.InputMismatchException;

public class Esercizio3 {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int n = 3;
        double sum = 0;
        System.out.println(
                "Inserisci tre numeri interi. Mi raccomando, usa la virgola per separare parte intera e frazionaria");

        try {
            for (int i = 0; i < n; i++) {
                sum += t.nextDouble();
            }
        } catch (InputMismatchException e) {
            System.out.println("Devi inserire la virgola, non il punto!");
        }

        System.out.println(sum);

    }
}