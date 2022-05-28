public class Painter {

    private GlobalState globalState;

    public Painter() {


    }

    public void init(GlobalState globalState) { this.globalState = globalState;}

    private void paintStatus() {


    }

    private void paintMenu() {


    }

    public void paint() {
        this.paintStatus();
        this.paintMenu();
    }


}
