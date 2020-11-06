import java.util.Scanner;

public class Esercizio2 {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        String s = t.nextLine();

        System.out.println(s.substring(s.indexOf(' ', s.indexOf(' ') + 1) + 1) + "\n"
                + s.substring(s.indexOf(' ') + 1, s.indexOf(' ', s.indexOf(' ') + 1)) + "\n"
                + s.substring(0, s.indexOf(' ')));
    }
}
