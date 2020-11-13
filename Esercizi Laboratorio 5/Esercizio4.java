import java.util.Scanner;

public class Esercizio4 {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        final int N_PAROLE = 3;
        String s= "";
        for(int i = 0; i< N_PAROLE; i++){
            s= s+" "+t.nextLine();
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
