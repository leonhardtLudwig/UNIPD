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
            while(prodotto!=n){
                if(n%primo==0){
                    System.out.print(primo+"*");
                    prodotto = prodotto*primo;
                }else{
                    primo = findPrimo(primo+2);
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
        boolean primo = n==2||n==3;
        for (int j = 2; !primo && j * j <= n; j++) {
            primo = n % j != 0;
        }
        return primo;
    }

}
