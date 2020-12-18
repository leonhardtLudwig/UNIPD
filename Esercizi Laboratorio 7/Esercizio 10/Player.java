import java.util.Random;

public class Player {
    private Random r;
    private String name;
    private int score;
    private int[] diceResults;

    // costruttore: il punteggio iniziale e' 0 cosi' come
    // i valori dei tiri dei tre dadi
    public Player(String aName) {
        r = new Random();
        this.name = aName;
        this.diceResults = new int[3];
    }

    // metodi di accesso
    public String getName() {
        return this.name;
    }

    public String getScore() {
        return Integer.toString(score);
    }

    // simula un turno di lancio di dadi attribuendo a ciascun
    // lancio un valore casuale tra 1 e 6
    public void turno() {
        for (int i = 0; i < diceResults.length; i++)
            diceResults[i % diceResults.length] = 1 + r.nextInt(5);
    }

    // restituisce un riferimento a un nuovo array di interi in
    // cui i valori ottenuti nei tre lanci sono ordinati
    public int[] sortDice() {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < diceResults.length - 1; i++) {
                if (diceResults[i] > diceResults[i + 1]) {
                    temp = diceResults[i];
                    diceResults[i] = diceResults[i + 1];
                    diceResults[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return diceResults;
    }

    // aggiorna il punteggio incrementandolo di una unita'
    public void addPoint() {
        this.score++;
    }

    // resetta il punteggio
    public void resetScore() {
        this.score = 0;
    }

    // restituisce una stringa con il nome del giocatore e
    // i valori dei lanci dei dadi
    public String toString() {
        String res = "";
        for (int i = 0; i < diceResults.length; i++) {
            res += diceResults[i] + " ";
        }
        return "Lanci di " + this.name + ": " + res;
    }
}