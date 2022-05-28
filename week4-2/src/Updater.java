import java.util.Random;

public class Updater {
    private GlobalState globalState;

    public Updater () {

    }

    public void init(GlobalState globalState) {
        this.globalState = globalState;
    }

    private void fight() {
        Random random = new Random();


        this.globalState.player.fight(this.globalState.dragon);// player fight

        boolean counterAtt = random.nextBoolean();
        if (counterAtt) {
            this.globalState.dragon.fight(this.globalState.player);// dragon fight
        }
    }

    private void defense() {
            System.out.println("defense!!!");

            this.globalState.player.setDef(this.globalState.player.getDef() *  2);
            this.globalState.dragon.fight(this.globalState.player);
            this.globalState.player.setDef(this.globalState.player.getDef() / 2);

    }

    private void terminateGame() {
            System.exit(0);
    }

    private void handleWrongInput() {
            System.out.println("Wrong input!!!");
    }


    public void update(int chosen) {
        switch (chosen){
            case 1:
                this.fight();
                break;
            case 2:
                this.defense();
                break;
            case 3:
                this.terminateGame();
                break;
            default:
                this.handleWrongInput();
                break;
        }
    }

    public boolean checkTermination() {
        if ( this.globalState.player.getHp() <= 0 ) {
            System.out.println("Player was killed. The dragon in too strong...");
            return true;
        } else if ( this.globalState.dragon.getHp() <= 0) {
            System.out.println("Player killed the dragon. Your're so strong!");
            return true;
        }
        return false;
    }
}
