import java.util.Scanner;
public class NumeriPrimi{
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        int n;
        do{
            System.out.println("Inserisci un intero positivo e ti dirò se è primo");
            n = t.nextInt();
        }while(n<=1);
        int divisore = 1;
        for(int j = 2; divisore == 1 && j*j<=n;j++){
            divisore = n%j==0?j:1;     
        }
        
        if(divisore!=1 && divisore!=n){
            System.out.println("Non è primo, il primo divisore trovato è" + divisore);
        }else{
            System.out.println("E' primo");
        }
    }
}