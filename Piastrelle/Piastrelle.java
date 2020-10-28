public class Piastrelle{

    public static void main(String args[]){

        int totalWidth = Integer.parseInt(args[0]);
        int tileWidth = Integer.parseInt(args[1]);

        int totalTiles = 0;
        double gap = 0; 

        if(totalWidth-tileWidth<0){
            System.out.println("Not enough space");
        }else{
            totalTiles = 1+ (totalWidth-tileWidth)/tileWidth;
            gap = (totalWidth - totalTiles*tileWidth)/2;
            System.out.println("There are "+ totalTiles + " tiles");
            System.out.println("Gap: "+ gap);
        }

    }

}