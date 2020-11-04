import java.util.Scanner;

public class Esercizio10 {
    public static void main(String args[]) {
        final String mesi = " Gennaio Febbrario Marzo Aprile Maggio Giugno Luglio Agosto Settembre Ottobre Novembre Dicembre ";
        Scanner t = new Scanner(System.in);
        int mese;
        do {
            System.out.println("Inserisci il numero di un mese (compreso tra 1 e 12)");
            mese = t.nextInt();
        } while (mese < 1 || mese > 12);
        int start=0;
        for(int i = 0;i<mese-1;i++){
            start = mesi.indexOf(' ', start+1);
        }
        System.out.println(mesi.substring(start+1, mesi.indexOf(' ', start+1)));
    }
}
