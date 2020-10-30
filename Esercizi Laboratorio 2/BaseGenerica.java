import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class BaseGenerica {
    static Scanner t = new Scanner(System.in);
    static int nCifre;
    static int base;
    static int maxBase10;
    static int base10Input;
    static String converted;

    public static void main(String args[]) {
        do {
            System.out.println("Inserisci una base >1");
            base = t.nextInt();
        } while (base <= 1);
        do {
            System.out.println("Inserisci un numero di cifre >=2");
            nCifre = t.nextInt();
        } while (nCifre < 2);
        maxBase10 = ((int) Math.pow(base, nCifre)) - 1;
        do{
            System.out.println("Inserisci un valore in base 10 compreso tra 0 e "
            + maxBase10);
            base10Input = t.nextInt();
        }while(base10Input<0 || base10Input>maxBase10);
        converted = convert();
        System.out.println("Il numero in base 10 \""
        +base10Input+"\"  in base "+ base + " equivale a \"" +converted+ "\"");
    }

    public static String convert(){
        int q = base10Input;
        int d = base;
        int[] num = new int[nCifre];
        for(int i = nCifre-1; i>=0;i--){
            num[i]= q%d;
            q= q/d;
        }
        String numToString = Arrays.toString(num).replaceAll("\\[|\\]|,|\\s", "");
        numToString = numToString.charAt(0)=='0'?numToString.substring(1):numToString;
        return numToString;
    };
}