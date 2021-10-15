// You need to implement this

import java.awt.*;

public class Giant extends Critter {
    private int count = 0;

    public Giant() {
        // TODO: your logic
    }

    public Action getMove(CritterInfo info) {
        if(count > 22){
            count = 0;
        }
        count ++;
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        int change = count /6;

        if(change==0){
            return "fee";
        } else if(change == 1){
            return "fle";
        } else if(change ==2){
            return "foe";
        } else if(change ==3){
            return "fum";
        } else {
            return "Error";
        }
    }    
}
