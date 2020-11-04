package Esercizio8;

public class MyRectangle {
    private int x;
    private int y;
    private int w;
    private int h;

    public MyRectangle(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getWidth(){
        return w;
    }
    public int getHeight(){
        return h;
    }

    public void resize(double mult){
        this.w *= mult;
        this.h *= mult;
    }

    public void translate(int dx, int dy){
        this.x = dx;
        this.y = dy;
    }

    public String toString(){
        return "Rettangolo: x="+x+", y="+y+", w="+w+", h="+h;
    }

}
