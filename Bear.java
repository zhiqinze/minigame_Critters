// You need to implement this

import java.awt.*;

public class Bear extends Critter {
    boolean polar;
    private int status = 0;
    
    public Bear(boolean polar) {
        this.polar=polar;
    }
    
    public Critter.Action getMove(CritterInfo info) {
        if(status == 0){
            status =1;
        } else if(status ==1){
            status =0;
        }
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        } else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }

    public Color getColor() {
        if(polar){
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString() {
        if(status == 0){
            return "/";
        } else if (status == 1) {
            return "\\";
        } else {
            return "Error";
        }
    }
}
