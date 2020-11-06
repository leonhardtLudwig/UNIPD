import java.util.Scanner;
import java.lang.Math;

public class Esercizio8 {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);

        int a, b, c;
        do {
            System.out.println("Inserisci il primo lato");
            a = t.nextInt();
        } while (a <= 0);
        do {
            System.out.println("Inserisci il secondo lato");
            b = t.nextInt();
        } while (b <= 0);
        do {
            System.out.println("Inserisci il terzo lato");
            c = t.nextInt();
        } while (c <= 0);

        if (a == b && b == c) {// è equilatero?
            System.out.println("Triangolo equilatero");
        } else if (isTriangolo(a, b, c)) { // è un triangolo?
            if (isIsoscele(a, b, c)) { // è isoscele?
                if (isAcutangolo(a, b, c)) { // è acutangolo?
                    System.out.println("Triangolo isoscele acutangolo ");
                } else if (isRettangolo(a, b, c)) {// è rettangolo?
                    System.out.println("Triangolo isoscele rettangolo ");
                } else {// allora è ottusangolo
                    System.out.println("Triangolo isoscele ottusangolo ");
                }
            } else { // allora è scaleno
                if (isAcutangolo(a, b, c)) { // è acutangolo?
                    System.out.println("Triangolo scaleno acutangolo");
                } else if (isRettangolo(a, b, c)) {// è rettangolo?
                    System.out.println("Triangolo scaleno rettangolo");
                } else {// allora è ottusangolo
                    System.out.println("Triangolo scaleno ottusangolo ");
                }
            }
        } else { // allora non è un triangolo
            System.out.println("Non è un triangolo");
        }

    }

    public static boolean isIsoscele(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    public static boolean isTriangolo(double a, double b, double c) {
        double alfa = Math.toDegrees(Math.acos(a / c));
        double beta = Math.toDegrees(Math.acos(b/c));
        double gamma = 180 - (alfa + beta);
        System.out.println(a/c);
        System.out.println(b/c);
        System.out.println("alfa: "+alfa+" beta: "+beta+ " gamma: "+gamma);
        return alfa+beta+gamma==180;
    }

    public static boolean isAcutangolo(double a, double b, double c) {
        double alfa = Math.toDegrees(Math.acos(a / c));
        double beta = Math.toDegrees(Math.acos(b /c));
        double gamma = 180 - (alfa + beta);
        return alfa < 90 && beta < 90 && gamma < 90;
    }

    public static boolean isRettangolo(double a, double b, double c) {
        double alfa = Math.toDegrees(Math.acos(a / c));
        double beta = Math.toDegrees(Math.acos(b /c));
        double gamma = 180 - (alfa + beta);
        return alfa == 90 || beta == 90 || gamma == 90;
    }

    public static boolean isOttusangolo(double a, double b, double c) {
        double alfa = Math.toDegrees(Math.acos(a / c));
        double beta = Math.toDegrees(Math.asin(a /c));
        double gamma = 180 - (alfa + beta);
        return alfa > 90 || beta > 90 || gamma > 90;
    }
}
