import java.util.Scanner;

public class Esercizio6 {

    public static boolean validInput(String s) {
        //controlla che l'input sia di 4 caratteri, tutti digits, che il primo sia <=2 e il terzo <=5
        if(s.length()!=4){
            return false;
        }else{
            boolean allDigits = true;
            for(int i = 0;allDigits && i<4;i++){
                allDigits = s.charAt(i)>=48 && s.charAt(i)<=57;
            }
            if(!allDigits){
                return false;
            }else{
                return (s.charAt(0)<=50)&&(s.charAt(2)<=53);
            } 
        }
    }

    public static int[] getOreMinuti(String o){
        //index=0:ore
        //index=1:minuti
        int[] oM = new int[2]; 
        oM[0]=Integer.parseInt(o.substring(0,2));
        oM[1]=Integer.parseInt(o.substring(2,4));
        return oM;
    }

    public static String tempoPassato(String orario1, String orario2){
        //index=0:ore
        //index=1:minuti
        int[] o1 = getOreMinuti(orario1);
        int[] o2 = getOreMinuti(orario2);
        if(o1[0]>=o2[0]&&o1[1]>=o2[1]){ //se il primo orario è successivo al secondo scambiali
            //swap ore
            o2[0]+=o1[0];
            o1[0]=o2[0]-o1[0];
            o2[0]-=o1[0];

            //swap minuti
            o2[1]+=o1[1];
            o1[1]=o2[1]-o1[1];
            o2[1]-=o1[1];
        }
        o2[0]=o2[1]<o1[1]?o2[0]-1:o2[0]; //se i minuti di orario uno sono di più scala di un'ora, altrimenti lascia invariato
        String tp = (o2[0]-o1[0])+":"+(o2[1]-o1[1]<0?60+o2[1]-o1[1]:o2[1]-o1[1]);
        return tp;
    }

    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        String primo = "";
        String secondo = "";
        do {//cicla il blocco di istruzioni fintanto che l'input non sarà valido
            System.out.println("Inserisci il primo orario nel formato HHMM");
            primo = t.nextLine();
        } while (!validInput(primo));
        do {//cicla il blocco di istruzioni fintanto che l'input non sarà valido
            System.out.println("Inserisi il secondo orario nel formato HHMM");
            secondo = t.nextLine();
        } while (!validInput(secondo));
        String differenza = tempoPassato(primo,secondo);
        System.out.println("Sono passate "+ differenza +" ore");
        t.close();
    }
}
