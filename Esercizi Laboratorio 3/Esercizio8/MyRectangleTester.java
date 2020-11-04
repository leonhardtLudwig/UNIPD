package Esercizio8;
;public class MyRectangleTester {
    public static void main(String args[]){
        MyRectangle r1 = new MyRectangle(0, 50, 20, 25);
        System.out.println(r1.toString());
        r1.resize(0.5);
        r1.translate(-50, -50);
        System.out.println(r1.toString());
    }
}
