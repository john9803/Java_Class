package unit;

import engine.InputGetter;
import state.Gstate;

public class Unit {

    private Gstate gstate;
//    engine.Updater updater = new engine.Updater();
    InputGetter inputGetter = new InputGetter();
//    engine.Painter painter = new engine.Painter();
    public void init(Gstate gstate) {
    this.gstate = gstate;
}

    public int roll_num;

    public int diceValue1;
    public int diceValue2;
    public int diceValue3;
    public int avgValue;

    public void rollDice() {

        }
}
