import java.util.Scanner;
public class Esercizio3{
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        int n; 
        do{
            n=t.nextInt();
        }while(n<=0);
        for(int i = 1; i<n;i=i+10){
            for(int j = i; j<=n && j<i+10;j++){
                System.out.print((j<10?"  ":j<100?" ":"")+j+" ");
            }
            System.out.println();
        }
    }
}