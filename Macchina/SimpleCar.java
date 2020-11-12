public class SimpleCar {
    private static double INITIAL_SPEED = 10.0;
    private static int MAX_GEAR = 6;
    private static int MIN_GEAR = 0;
    private static double SPEED_DECREMENT_PERCENT = 0.3;
    private static double SPEED_INCREMENT_PERCENT = 0.5;

    private double v;
    private int cambio;

    public SimpleCar(){
        this.v = 0.0;
        this.cambio = MIN_GEAR;
    }

    public void brake(){
        v = v==0?0:v-v*SPEED_DECREMENT_PERCENT;
    }

    public void gearDown(){
        cambio = cambio>MIN_GEAR?cambio-1:cambio;
    }

    public void gearUp(){
        cambio = cambio<MAX_GEAR?cambio+1:cambio;
    }

    public void speedUp(){
        v = v==0?INITIAL_SPEED:v+v*SPEED_INCREMENT_PERCENT;
    }

    public String toString(){
        return "SimpleCar: marcia="+cambio+", velocita'="+v+" km/h";
    }
}
