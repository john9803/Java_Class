package engine;

import state.GlobalState;

public class Engine {

    private static Engine unique_engine = new Engine();

    private Painter painter;


    private Engine(){
        this.painter = new Painter();

    }

    public static Engine getInstance(){ return unique_engine; }

    public void init() {
        GlobalState.globalState.init();
        this.painter.init();

        this.painter.switchField();

    }


}
