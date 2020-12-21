import java.util.Scanner;

public class Collaudo {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int []tripla = extractTripla(t.nextLine());
        Square q1 = new Square(tripla[0], tripla[1], tripla[2]);
        tripla = extractTripla(t.nextLine());
        Square q2 = new Square(tripla[0], tripla[1], tripla[2]);
        System.out.println(q1.toString());
        System.out.println(q2.toString());
        int[] coppia =extractCoppia(t.nextLine());
        q1.setSize(coppia[0], coppia[1]);
        coppia =extractCoppia(t.nextLine());
        q2.setSize(coppia[0], coppia[1]);
        System.out.println(q1.toString());
        System.out.println(q2.toString());
    }

    public static int[] extractCoppia(String s){
        if (s == null || s.length() < 3)
            throw new IllegalArgumentException("Non hai inserito una stringa corretta");
        int[] t = new int[2];
        int x = 0;
        for (int i = 0, j = 0; i < t.length; i++) {
            try{x = s.indexOf(" ", j);
            if (x != -1) {
                t[i] = Integer.parseInt(s.substring(j, x));
            } else {
                t[i] = Integer.parseInt(s.substring(j));
            }
            j = s.indexOf(" ", j) + 1;}catch(NumberFormatException e){
                System.err.println("Non hai inserito una stringa corretta");
                System.exit(-1);
            }
        }
        if(x!=-1) throw new IllegalArgumentException("Hai inserito troppi parametri o hai aggiunto spazi dopo la tripla");
        return t;
    }

    public static int[] extractTripla(String s) {
        if (s == null || s.length() < 5)
            throw new IllegalArgumentException("Non hai inserito una stringa corretta");
        int[] t = new int[3];
        int x = 0;
        for (int i = 0, j = 0; i < t.length; i++) {
            try{x = s.indexOf(" ", j);
            if (x != -1) {
                t[i] = Integer.parseInt(s.substring(j, x));
            } else {
                t[i] = Integer.parseInt(s.substring(j));
            }
            j = s.indexOf(" ", j) + 1;}catch(NumberFormatException e){
                System.err.println("Non hai inserito una stringa corretta");
                System.exit(-1);
            }
        }
        if(x!=-1) throw new IllegalArgumentException("Hai inserito troppi parametri o hai aggiunto spazi dopo la tripla");
        return t;
    }
}
