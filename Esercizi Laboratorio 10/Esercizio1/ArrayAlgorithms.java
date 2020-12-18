package Esercizio1;

import java.util.Random;

public class ArrayAlgorithms {

    public static void shuffle(Comparable[] a) {
        if (a == null)
            return;
        if (a.length < 2)
            return;
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            swap(a, r.nextInt(10), r.nextInt(10));
        }
    }

    public static void selectionSort(Comparable[] a) {
        if (a == null)
            return;
        if (a.length < 2)
            return;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = findMinPos(a, i);
            if (j != i)
                swap(a, i, j);
        }
    }

    private static void merge(Comparable[] a, Comparable[] b, Comparable[] c) {
        int ia = 0, ib = 0, ic = 0; //
        while (ib < b.length && ic < c.length)
            if (b[ib].compareTo(c[ic]) < 0) // per “cancellare” un
                a[ia++] = b[ib++]; // elemento da b o c
            else // incremento il
                a[ia++] = c[ic++]; // relativo indice
        // attenzione ai due cicli che seguono...
        while (ib < b.length)
            a[ia++] = b[ib++];
        while (ic < c.length)
            a[ia++] = c[ic++];
    } // NON è un metodo ricorsivo,

    public static void mergeSort(Comparable[] a) {
        if (a == null)
            return;
        if (a.length < 2)
            return;
        // se pari inizia da length/2
        int mid = a.length / 2;
        Comparable[] left = new Comparable[mid];
        Comparable[] right = new Comparable[a.length - mid];
        // (source, sourcePos, dest, destPos, length)
        System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, mid, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);

        merge(a, left, right);
    }

    public static void insertionSort(Comparable[] a) {
        if (a == null)
            return;
        if (a.length < 2)
            return;
        for (int i = 1; i < a.length; i++) { // sposto a[i] verso sinistra finché serve:
                                             // il primo elemento con cui confrontarlo è
                                             // a[i-1], quindi parto con j = i-1
            for (int j = i - 1; j >= 0; j--)
                if (a[j].compareTo(a[j + 1]) > 0)

                    // devo spostare a[j+1] verso sinistra
                    swap(a, j, j + 1); //
                else // non devo più spostare
                    break; // è arrivato nel posto giusto
        }
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int findMinPos(Comparable[] a, int from) {
        int pos = from;
        for (int i = from + 1; i < a.length; i++)
            if (a[i].compareTo(a[pos]) < 0)
                pos = i;
        return pos;
    }

}
