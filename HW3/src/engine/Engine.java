package engine;

import state.Gstate;
import unit.Unit;

public class Engine {

    private static Engine unique_engine = new Engine();


    private Painter painter;
    private InputGetter inputGetter;
    private Updater updater;
    private Unit unit;
    private Gstate gstate;

    public Engine(){
        this.painter = new Painter();
        this.inputGetter = new InputGetter();
        this.updater = new Updater();
        this.gstate = new Gstate();

    }

    public static Engine getInstance() { return unique_engine;}

    public void init() {
        this.painter.init(this.gstate);
        this.inputGetter.init(this.gstate);
        this.updater.init(this.gstate);

    }

    public void run() {
        while(! this.updater.checkTermination()){
            System.out.println("player turn\n");

            this.painter.paintBoard();
            this.inputGetter.player_input_num();
            this.gstate.player.rollDice();
            this.updater.player_update();

            this.painter.player_paintStatus();
            System.out.print(this.gstate.player.getCnt());

            System.out.println("computer turn\n");

            this.painter.paintBoard();
            this.inputGetter.computer_input_num();
            this.gstate.computer.rollDice();
            this.updater.computer_update();
            this.painter.computer_paintStatus();
            System.out.print(this.gstate.computer.getCnt());

        }

    }

}
