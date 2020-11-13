import java.util.Scanner;

public class Esercizio8 {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int numInseriti = 0;
        int n;
        do {
            n = t.nextInt();
        } while (numInseriti < 2 || t.hasNextInt());
    }
}
