package score;

import constant.Constant;
import state.Gstate;

public class Score {

    private int x_val;
    private int y_val;

    public Score(int x_val, int y_val){
        this.x_val = x_val;
        this.y_val = y_val;
    }

    private Gstate gstate;
    public void init(Gstate gstate) {
        this.gstate = gstate;
    }

    public String[][] score = new String[Constant.BOARD_SIZE][Constant.BOARD_SIZE];
}
