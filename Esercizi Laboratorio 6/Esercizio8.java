import java.util.Scanner;
public class Esercizio8{

    public static int MAX_VAL =0;

    public static int[] values(String v){
        int n = 0;
        int i = 0;
        while(i!=-1){
            n++;
            i = v.indexOf(' ', i+1);
        }
        int[] vals = new int[n];
        while(i!=-1){
            n++;
            i = v.indexOf(' ', i+1);
        }
        i = 0;
        for(int j= 0; i<v.length() && j< n; j++){
            vals[j]=Integer.parseInt(v.indexOf(' ', i+1)!=-1?v.substring(i,v.indexOf(' ',v.indexOf(' ', i+1))):v.substring(i));
            i = v.indexOf(' ', i+1)+1;
        }
        return vals;
    }

    public static boolean isValid(int[]s){
        boolean[]usedValues = new boolean[MAX_VAL];
        boolean compreso = s[0]>=0 && s[0]<=MAX_VAL; 
        int i = 0;
        for(;i<s.length&&compreso&& !usedValues[s[i]-1] ; i++){ 
            usedValues[s[i]-1]=true;
            if(i+1<s.length){compreso= s[i+1]>=0 && s[i+1]<=MAX_VAL;}
        }
        return i==s.length&&compreso;
    }

    public static boolean isQuadrato(int n ){
        double sqr = Math.sqrt(n);
        return sqr - (int)sqr==0.0;
    }
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        System.out.println("Inserisci una sequenza di valori interi positivi separati da uno spazio");
        String seq = t.nextLine();
        int[] sequenza = values(seq);
        for(int i = 0; i< sequenza.length;i++){
            System.out.print(sequenza[i]+" ");
        }
        System.out.println();
        int n = 0;
        if(isQuadrato(sequenza.length)){
            n = sequenza.length;
            MAX_VAL = n*n;
        }else{
            System.out.println("Non è un quadrato");
        }
        if(isValid(sequenza)){
            System.out.println("valido");
            
        }else{
            System.out.println("Non è valido");
        }

    }
}