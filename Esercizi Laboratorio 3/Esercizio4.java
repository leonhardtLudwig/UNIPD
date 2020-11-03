import java.util.Scanner;
public class Esercizio4 {

    public static String stringRoot(String s){// funzione implementata per pulizia codice
        return s.substring(0,s.length()-1);
    }
    public static void printAggettivi(String aggettivo, char lastChar){
        System.out.println("Il diminutivo è: "+ stringRoot(aggettivo)+"in"+lastChar);    
        System.out.println("Il superlativo è: "+ stringRoot(aggettivo)+"issim"+lastChar);    
    }
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);   
        System.out.println("Inserisci un aggettivo");
        String aggettivo = t.nextLine();
        char lastChar = aggettivo.charAt(aggettivo.length()-1);
        if(lastChar == 'o' || lastChar == 'i'){ // aggettivi maschili
            printAggettivi(aggettivo, lastChar);
        }else if(lastChar == 'a' || lastChar == 'e'){ // aggettivi femminili
            printAggettivi(aggettivo, lastChar);
        }else{
            System.out.println("Che razza di aggettivo è?");
        }
    }
}
