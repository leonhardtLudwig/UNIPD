import java.util.Scanner;

public class FattoriPrimi {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int n;
        do {
            System.out.println("Inserisci un numero intero maggiore di 1");
            n = t.nextInt();
        } while (n <= 1);
        if(isPrimo(n)){
            System.out.println(n+" e' primo");
        }else{
            int prodotto = 1;
            int primo = 2;
            int num = n;
            while(prodotto!=n){
                if(num%primo==0){
                    prodotto = prodotto*primo;
                    num = num/primo;
                    System.out.print(primo+(prodotto!=n?"*":""));   
                }else{
                    primo = findPrimo(primo+1);
                }
            }
            System.out.println();
        }
    }

    public static int findPrimo(int index) {
        int i = index-1;
        do {

        } while (!isPrimo(++i));
        return i;
    }

    public static boolean isPrimo(int n) {
        int divisore = 1;
        for(int j = 2; divisore == 1 && j*j<=n;j++){
            divisore = n%j==0?j:1;     
        }
        return !(divisore!=1 && divisore!=n);
    }

}
