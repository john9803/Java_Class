package engine;

import constant.Constant;
import state.Gstate;
import unit.Unit;

public class Updater extends Unit {

    private Gstate gstate;

    public Updater() {

    }

    public void init(Gstate gstate) {
        this.gstate = gstate;
    }


    public void init() {
    }

    private void terminateGame() {
        System.exit(0);
    }

    private void handleWrongInput() {
        System.out.println("Wrong input!!!");
    }

    public void player_update() {

                switch (this.gstate.player.getCnt() / Constant.BOARD_SIZE) {
                    case 0:
                        this.gstate.player.setPosition_x(this.gstate.player.getCnt());
                        this.gstate.player.setPosition_y(Constant.MIN_Y);
                        this.gstate.score.score[this.gstate.player.getPosition_y()][this.gstate.player.getPosition_x()] = "|p |";
                        this.gstate.score.score[this.gstate.computer.getPosition_y()][this.gstate.computer.getPosition_x()] = "| c|";
                        break;
                    case 1:
                        this.gstate.player.setPosition_x(Constant.MAX_X);
                        this.gstate.player.setPosition_y(this.gstate.player.getCnt() % Constant.BOARD_SIZE);
                        this.gstate.score.score[this.gstate.player.getPosition_y()][this.gstate.player.getPosition_x()] = "|p |";
                        this.gstate.score.score[this.gstate.computer.getPosition_y()][this.gstate.computer.getPosition_x()] = "| c|";
                        break;
                    case 2:
                        this.gstate.player.setPosition_x(Constant.MAX_X - (this.gstate.player.getCnt() % Constant.BOARD_SIZE));
                        this.gstate.player.setPosition_y(Constant.MAX_Y);
                        this.gstate.score.score[this.gstate.player.getPosition_y()][gstate.player.getPosition_x()] = "|p |";
                        this.gstate.score.score[this.gstate.computer.getPosition_y()][gstate.computer.getPosition_x()] = "| c|";
                        break;
                    case 3:
                        this.gstate.player.setPosition_x(Constant.MIN_X);
                        this.gstate.player.setPosition_y(Constant.MAX_Y - (this.gstate.player.getCnt() % Constant.BOARD_SIZE));
                        this.gstate.score.score[this.gstate.player.getPosition_y()][this.gstate.player.getPosition_x()] = "|p |";
                        this.gstate.score.score[this.gstate.computer.getPosition_y()][this.gstate.computer.getPosition_x()] = "| c|";
                        break;
                }

        }


    public void computer_update() {

                switch (this.gstate.computer.getCnt() / Constant.BOARD_SIZE) {
                    case 0:
                        this.gstate.computer.setPosition_x(this.gstate.computer.getCnt());
                        this.gstate. computer.setPosition_y(Constant.MIN_Y);
                        this.gstate.score.score[this.gstate.player.getPosition_y()][this.gstate.player.getPosition_x()] = "|p |";
                        this.gstate.score.score[this.gstate.computer.getPosition_y()][this.gstate.computer.getPosition_x()] = "| c|";
                        break;
                    case 1:
                        this.gstate.computer.setPosition_x(Constant.MAX_X);
                        this.gstate.computer.setPosition_y(this.gstate.computer.getCnt() % Constant.BOARD_SIZE);
                        this.gstate.score.score[this.gstate.player.getPosition_y()][this.gstate.player.getPosition_x()] = "|p |";
                        this.gstate.score.score[this.gstate.computer.getPosition_y()][this.gstate.computer.getPosition_x()] = "| c|";
                        break;
                    case 2:
                        this.gstate. computer.setPosition_x(Constant.MAX_X - (this.gstate.computer.getCnt() % Constant.BOARD_SIZE));
                        this.gstate. computer.setPosition_y(Constant.MAX_Y);
                        this.gstate.score.score[this.gstate.player.getPosition_y()][this.gstate.player.getPosition_x()] = "|p |";
                        this.gstate.score.score[this.gstate.computer.getPosition_y()][this.gstate.computer.getPosition_x()] = "| c|";
                        break;
                    case 3:
                        this.gstate.computer.setPosition_x(Constant.MIN_X);
                        this.gstate. computer.setPosition_y(Constant.MAX_Y - (this.gstate.computer.getCnt() % Constant.BOARD_SIZE));
                        this.gstate.score.score[this.gstate.player.getPosition_y()][this.gstate.player.getPosition_x()] = "|p |";
                        this.gstate.score.score[this.gstate.computer.getPosition_y()][this.gstate.computer.getPosition_x()] = "| c|";
                        break;
                }

    }

    public boolean checkTermination() {
        if (this.gstate.player.getLap_num() == 3) { // Exit condition, when lap_num is 3
            System.out.println("unit.Player win!");
            return true;
        } else if (this.gstate.computer.getLap_num() == 3) {
            System.out.println("unit.Computer win!");
            return true;
        }
        return false;

    }
}
