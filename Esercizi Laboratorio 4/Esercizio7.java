import java.util.Scanner;
public class Esercizio7 {
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        String a = t.nextLine();
        String b = t.nextLine();
        String c = t.nextLine();

        if(a.compareTo(b)>0&&a.compareTo(c)>0){//la stringa a è la più piccola?
            if(b.compareTo(c)<0){//la stringa b è più grande di c?
                System.out.println(b+"\n"+c+"\n"+a);
            }else{//la stringa c è più grande di b
                System.out.println(c+"\n"+b+"\n"+a);
            }
        }else if(b.compareTo(a)>0&&b.compareTo(c)>0){//la stringa b è la più piccola?
            if(a.compareTo(c)<0){//la stringa a è più grande di c?
                System.out.println(a+"\n"+c+"\n"+b);
            }else{//la stringa c è più grande di a
                System.out.println(c+"\n"+a+"\n"+b);
            }
        }else if(c.compareTo(b)>0&&c.compareTo(a)>0){//la stringa c è la più piccola?
            if(a.compareTo(b)<0){//la stringa a è più grande di b?
                System.out.println(a+"\n"+b+"\n"+c);
            }else{//la stringa b è più grande di a
                System.out.println(b+"\n"+a+"\n"+c);
            }
        }

    }
}
