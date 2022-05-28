public class Updater {

    private GlobalState globalState;

    public Updater () {

    }


    public void init(GlobalState globalState){ this.globalState = globalState;}

    private void terminateGame() { System.exit(0);}

    private void handleWrongInput() { System.out.println("Wrong input!!!");}


    private void player_update() {

    }



    public void update(int roll_num){
        System.out.print("* how many times will you roll the dice (1~3)? ");



    }

    public boolean checkTermination() {
        if (this.globalState.player.getLap_num()== 3) { // Exit condition, when lap_num is 3
            System.out.println("Player win!");
            return true;
        }
        else if (this.globalState.computer.getLap_num() == 3 ){
            System.out.println("Computer win!");
            return true;
        }
        return false;

    }

}
