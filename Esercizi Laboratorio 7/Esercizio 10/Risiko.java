import java.util.Scanner;
public class Risiko {
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        System.out.println("Inserisci il nome del giocatore 1");
        Player p1 = new Player(t.nextLine());
        System.out.println("Inserisci il nome del giocatore 2");
        Player p2 = new Player(t.nextLine());

        p1.turno();
        System.out.println(p1.toString());
        int[] p1Res = p1.sortDice();

        p2.turno();
        System.out.println(p2.toString());
        int[] p2Res = p2.sortDice();

        System.out.println("Lanci ordinati");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        for(int i = 0; i<p1Res.length; i++){
            
        }


    }
}
