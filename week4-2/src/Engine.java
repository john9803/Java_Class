
public class Engine {
    //게임을 돌리는 기능, 루프 이런거 다 여기에 모다놈
    private static Engine unique_engine = new Engine(); // 유일한 엔진을 만듬

    private GlobalState globalState;
    private Painter painter;
    private InputGetter inputGetter;
    private Updater updater;


    public Engine() {
        this.globalState = new GlobalState();
        this.painter = new Painter();
        this.inputGetter = new InputGetter();
        this.updater = new Updater();
    }

    public static Engine getInstance() {
        return unique_engine;
    }

    public void init() {
        this.painter.init(this.globalState);
        this.inputGetter.init(this.globalState);
        this.updater.init(this.globalState);

    }

    public void run() {
        do {
            this.painter.paint();
            int chosen = this.inputGetter.getInput();
            this.updater.update(chosen);

        } while(!this.updater.checkTermination());
    }

}
