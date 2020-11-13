import java.util.Scanner;

public class Esercizio4 {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        String s = t.nextLine();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
