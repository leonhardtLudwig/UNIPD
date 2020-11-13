import java.util.Scanner;
public class Esercizio7 {
        public static void main(String args[]){
            Scanner t = new Scanner(System.in);
            int numInseriti = 0;
            int n;
            int somma = 0;
            int sommaValAss = 0;
            int prodotto = 1;
            double valMedio = 0;
            do{
                n = t.nextInt();
                numInseriti = n==0?numInseriti:numInseriti+1;
                somma += n;
                sommaValAss += (int)Math.abs(n);
                prodotto*=n;
                valMedio+= n/2.0;
            }while(numInseriti<2 || t.hasNextInt());

            System.out.println("Somma: "+somma);
            System.out.println("Somma valori assoluti: "+ sommaValAss);
            System.out.println("Prodotto: "+ prodotto);
            System.out.println("Valor Medio: "+valMedio);
        }
}
