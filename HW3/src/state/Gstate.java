package state;

import score.Score;
import unit.Computer;
import unit.Player;

public class Gstate {

    public Player player;
    public Computer computer;
    public Score score;


    public Gstate(){
        this.player = new Player(0,0,0,0);
        this.computer = new Computer(0,0,0,0);
        this.score = new Score(0,0);
    }



}
