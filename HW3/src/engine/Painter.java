package engine;

import constant.Constant;
import state.Gstate;
import unit.Unit;

public class Painter extends Unit {

    Gstate gstate = new Gstate();
    public void init(Gstate gstate) {
        this.gstate = gstate;
    }


    public Painter() {



    }


    public void player_paintStatus() {
        switch (roll_num) {
            case 1:
                if (this.gstate.player.getCnt() >= Constant.MAX_CNT) { // position renew
                    this.gstate.player.setCnt(this.gstate.player.getCnt() % Constant.MAX_CNT);
                    this.gstate.player.setLap_num(this.gstate.player.getLap_num() + 1);
                    System.out.println("1. dice: " + diceValue1);
                    System.out.println("============================");
                    System.out.println("average number: " + avgValue);
                    System.out.println(this.gstate.player.getLap_num() + "th round complete!");
                    System.out.println("============================");
                } else {
                    System.out.println("average number: " + avgValue);
                    System.out.println("============================");
                }
                break;
            case 2:
                if (this.gstate.player.getCnt() >= Constant.MAX_CNT) { // position renew
                    this.gstate.player.setCnt(this.gstate.player.getCnt() % Constant.MAX_CNT);
                    this.gstate.player.setLap_num(this.gstate.player.getLap_num() + 1);
                    System.out.println("1. dice: " + diceValue1);
                    System.out.println("2. dice: " + diceValue2);
                    System.out.println("============================");
                    System.out.println("average number: " + avgValue);
                    System.out.println(this.gstate.player.getLap_num() + "th round complete!");
                    System.out.println("============================");
                } else {
                    System.out.println("1. dice: " + diceValue1);
                    System.out.println("2. dice: " + diceValue2);
                    System.out.println("============================");
                    System.out.println("average number: " + avgValue);
                    System.out.println("============================");
                }
                break;
            case 3:
                if (this.gstate.player.getCnt() > Constant.MAX_CNT) { // position renew
                    this.gstate.player.setCnt(this.gstate.player.getCnt() % Constant.MAX_CNT);
                    this.gstate.player.setLap_num(this.gstate.player.getLap_num() + 1);
                    System.out.println("1. dice: " + diceValue1);
                    System.out.println("2. dice: " + diceValue2);
                    System.out.println("3. dice: " + diceValue3);
                    System.out.println("============================");
                    System.out.println("average number: " + avgValue);
                    System.out.println(this.gstate.player.getLap_num() + "th round complete!");
                    System.out.println("============================");
                } else {
                    System.out.println("1. dice: " + diceValue1);
                    System.out.println("2. dice: " + diceValue2);
                    System.out.println("3. dice: " + diceValue3);
                    System.out.println("============================");
                    System.out.println("average number: " + avgValue);
                    System.out.println("============================");
                }
                break;
        }
    }
        public void computer_paintStatus() {
            switch (roll_num) {
                case 1:
                    if (this.gstate.computer.getCnt() >= Constant.MAX_CNT) { // position renew
                        this.gstate.computer.setCnt(this.gstate.computer.getCnt() % Constant.MAX_CNT);
                        this.gstate.computer.setLap_num(this.gstate.computer.getLap_num() + 1);
                        System.out.println("1. dice: " + diceValue1);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue);
                        System.out.println(this.gstate.computer.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("average number: " + avgValue);
                        System.out.println("============================");
                    }
                    break;
                case 2:
                    if (this.gstate.computer.getCnt() >= Constant.MAX_CNT) { // position renew
                        this.gstate.computer.setCnt(this.gstate.computer.getCnt() % Constant.MAX_CNT);
                        this.gstate.computer.setLap_num(this.gstate.computer.getLap_num() + 1);
                        System.out.println("1. dice: " + diceValue1);
                        System.out.println("2. dice: " + diceValue2);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue);
                        System.out.println(this.gstate.computer.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("1. dice: " + diceValue1);
                        System.out.println("2. dice: " + diceValue2);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue);
                        System.out.println("============================");
                    }
                    break;
                case 3:
                    if (this.gstate.computer.getCnt() > Constant.MAX_CNT) { // position renew
                        this.gstate.computer.setCnt(this.gstate.computer.getCnt() % Constant.MAX_CNT);
                        this.gstate.computer.setLap_num(this.gstate.computer.getLap_num() + 1);
                        System.out.println("1. dice: " + diceValue1);
                        System.out.println("2. dice: " + diceValue2);
                        System.out.println("3. dice: " + diceValue3);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue);
                        System.out.println(this.gstate.computer.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("1. dice: " + diceValue1);
                        System.out.println("2. dice: " + diceValue2);
                        System.out.println("3. dice: " + diceValue3);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue);
                        System.out.println("============================");
                    }
                    break;
            }




    }

    public void paintMenu() {


    }

    public void paintBoard(){

                for (int y = 0; y <= 9; y++) {
            for (int x = 0; x <= 9; x++) {
                if (x > 0 && x < 9 && y > 0 && y < 9) {
                    this.gstate.score.score[y][x] = "    ";
                    System.out.print(this.gstate.score.score[y][x]);
                } else {
                    if (!((x == this.gstate.player.getPosition_x() && y == this.gstate.player.getPosition_y()) || (x == this.gstate.computer.getPosition_x() && y == gstate.computer.getPosition_y()))) {
                        this.gstate.score.score[y][x] = "|  |";
                        System.out.print(this.gstate.score.score[y][x]);
                    } else if (gstate.player.getPosition_x() == this.gstate.computer.getPosition_x() && this.gstate.player.getPosition_y() == gstate.computer.getPosition_y()) {
                        this.gstate.score.score[y][x] = "|pc|";
                        System.out.print(this.gstate.score.score[y][x]);
                    } else {
                        System.out.print(this.gstate.score.score[y][x]);
                    }
                }

                if (x == 9) {
                    System.out.println("");
                }
            }
        }
    }

    public void paint() {
        this.paintBoard();
        this.paintMenu();

    }


}
