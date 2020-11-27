import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Esercizio8 {

    public static String upperFirst(String s) {
        String u = "";
        if (s.charAt(0) >= 97 && s.charAt(0) <= 122) {
            u+= (char)(s.charAt(0)-32);
        } else {
            u += s.charAt(0);
        }
        if (s.length() > 1) {
            u += s.substring(1).toLowerCase();
        }
        return u;
    }

    public static String elaboraStringa(String s) {
        String fix = "";
        int c = 0;
        for (int i = 0; s.indexOf(' ', i) != -1;) {
                fix += upperFirst(s.substring(i, s.indexOf(' ', i))+" ");
                i = s.indexOf(' ', i) + 1;
                if(i!=-1){
                    c = i;
                }
        }
        fix += upperFirst(s.substring(c));
        return fix;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il nome del file di input");
        String inputName = scan.nextLine();
        System.out.println("Inserisci il nome del file di output");
        String outputName = scan.nextLine();
        scan.close();
        try {
            FileReader in = new FileReader(inputName);
            scan = new Scanner(in);
            PrintWriter out = new PrintWriter(outputName);
            String s = "";
            while (scan.hasNextLine()) {
                s = elaboraStringa(scan.nextLine());
                out.println(s);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            System.err.println("File non trovato!" + e);
        }
    }
}