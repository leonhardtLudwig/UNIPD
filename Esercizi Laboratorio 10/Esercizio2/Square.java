import java.awt.*;
public class Square extends Rectangle{
    public Square(int x, int y, int l){
        super(x,y,l,l);
    }

    public int getArea(){
        return (int)(super.getWidth()*super.getHeight());
    }


    public void setSize(int width, int height){
        if(width!=height)throw new IllegalArgumentException();
        super.setSize(width, height);
    }


    public void setSize(int dim){
        setSize(dim,dim);
    }


}