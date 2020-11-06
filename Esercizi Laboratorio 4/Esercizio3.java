import java.util.Scanner;
 class Esercizio3 {
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        int a = t.nextInt();
        int b = t.nextInt();
        System.out.println("La somma è: "+sum(a,b));
        System.out.println("Il prodotto è: "+prod(a,b));
        System.out.println("Il valore medio è: "+valMed(a,b));
        System.out.println("Il valore massimo è: "+max(a,b));
        System.out.println("Il valore minimo è: "+min(a,b));
        System.out.println("Il valore assoluto della differenza è: "+valAssDiff(a,b));
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int prod(int a, int b){
        return a*b;
    }

    public static int valMed(int a, int b){
        return (a+b)/2;
    }

    public static int max(int a, int b){
        return a>b?a:b;
    }

    public static int min(int a, int b){
        return a<b?a:b;
    }

    public static int valAssDiff(int a, int b){
        return (a-b)*((a-b)<0?-1:1);
    }
}
