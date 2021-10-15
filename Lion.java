/**
 *
 * @author zubinwang
 */
import java.awt.*;
import java.util.Random;

public class Lion extends Critter {
    Random rand = new Random();
    private int randomNum = rand.nextInt(3);
    private int save = randomNum;
    private int count = 0;
    
    public Lion() {
    }
    
    public Action getMove(CritterInfo info) {
        count ++;
        if(count > 2) {

            count = 0;
            randomNum = rand.nextInt(3);
            while(randomNum == save) {

                randomNum = rand.nextInt(3);
            }
            save = randomNum;
        }

        if(info.getFront() == Neighbor.OTHER) {

            return Action.INFECT;
        }else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {

            return Action.LEFT;
        }else if(info.getFront() == Neighbor.SAME) {

            return Action.RIGHT;
        }else if(info.getFront() == Neighbor.EMPTY) {

            return Action.HOP;
        }else {

            return null;
        }
    }


    public Color getColor() {
        if(randomNum == 0){
            return Color.RED;
        } else if (randomNum == 1){
            return Color.GREEN;
        } else if (randomNum == 2){
            return Color.BLUE;
        } else {
            return null;
        }
    }

    public String toString() {
        return "L";
    }
}

