import java.util.Scanner;

public class Esercizio5 {

    public static boolean validInput(String s) {
        return true;
    }

    public static boolean areSuccessivi(String o1, String o2){
        return true;
    }

    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        String primo = "";
        String secondo = "";
        do {
            System.out.println("Inserisci il primo orario");
            primo = t.nextLine();
        } while (!validInput(primo));
        do {
            System.out.println("Inserisi il secondo orario");
            secondo = t.nextLine();
        } while (!validInput(secondo));
        if(areSuccessivi(primo, secondo)){
            
        }else{
            System.out.println("Attenzione, il primo orario è successivo al secondo");
        }
    }
}
