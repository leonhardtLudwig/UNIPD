import java.util.Scanner;
class Esercizio1{
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        String s = t.nextLine();
        System.out.println(s.substring(0,s.indexOf(' ')));
        System.out.println(s.substring(s.indexOf(' ')+1,s.indexOf(' ', s.indexOf(' ')+1)));
        System.out.println(s.substring(s.indexOf(' ',s.indexOf(' ')+1)+1));
    }
}