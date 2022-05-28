package unit;

import constant.Constant;
import state.Gstate;
import unit.Unit;

public class Computer extends Unit {


    private int cnt;
    private int position_x;
    private int position_y;
    private int lap_num;

    int diceValue1 = (int) (Math.random() * Constant.COMPUTER_DICE_NUM) + 1;
    int diceValue2 = (int) (Math.random() * Constant.COMPUTER_DICE_NUM) + 1;
    int diceValue3 = (int) (Math.random() * Constant.COMPUTER_DICE_NUM) + 1;

    public Computer( int cnt, int position_y, int position_x, int lap_num) {
        this.cnt = cnt;
        this.position_y = position_y;
        this.position_x = position_x;
        this.lap_num = lap_num;
    }

    private Gstate gstate;
    public void init(Gstate gstate) {
        this.gstate = gstate;
    }


    public void rollDice() {
        switch (this.roll_num) {
            //computer roll Dice
            case 1:
                this.avgValue = (this.diceValue1) / Constant.DICE_1;
                this.gstate.computer.setCnt(this.gstate.computer.getCnt() + this.avgValue);

                break;
            case 2:
                this.avgValue = (this.diceValue1 + this.diceValue2) / Constant.DICE_2;
                this.gstate.computer.setCnt(this.gstate.computer.getCnt() + this.avgValue);

                break;

            case 3:
                this.avgValue = (this.diceValue1 + this.diceValue2 + this.diceValue3) / Constant.DICE_3;
                this.gstate.computer.setCnt(this.gstate.computer.getCnt() + this.avgValue);
                break;

        }
    }





    public int getCnt() {
        return this.cnt;
    }

    public void setCnt(int cnt ) {
        this.cnt = cnt;
    }

    public int getPosition_x() {return this.position_x;}

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return this.position_y;
    }

    public void setPosition_y(int position_y ) {
        this.position_y = position_y;
    }

    public int getLap_num() {
        return this.lap_num;
    }

    public void setLap_num(int lap_num) {
        this.lap_num = lap_num;
    }
}
