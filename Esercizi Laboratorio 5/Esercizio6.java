import java.util.Scanner;

public class Esercizio6 {
    
    public static final String VALID_DNA_CHAR = "ACGT";

    public static boolean isValidDnaSeq(String dna){
        boolean isValid = dna.length()>0;
        boolean found = false;
        for(int i = 0; isValid && i<4;i++){
            for(int j = 0;!found && j<4;j++){
                found = dna.charAt(i)==VALID_DNA_CHAR.charAt(j);
            }
            isValid = found;
        }
        return isValid;
    }

    public static int findIndex(char c){
        int i = 0;
        for(;c != VALID_DNA_CHAR.charAt(i)&&i<4;i++);
        return i;
    }

    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        String dnaSeq = "";
        do{
            System.out.println("Inserisci una sequenza di DNA valida");
            dnaSeq = (t.nextLine()).toUpperCase();
        }while(!isValidDnaSeq(dnaSeq));
        String compInv = "";
        for(int i = dnaSeq.length()-1;i>=0;i--){
            compInv = compInv + VALID_DNA_CHAR.charAt(3-findIndex(dnaSeq.charAt(i)));
        }
        System.out.println(compInv);
    }
}
