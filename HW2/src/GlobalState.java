public class GlobalState {

    public Player player;
    public Computer computer;

    public GlobalState() {
        this.player = new Player(0,0,0,0);
        this.computer = new Computer(0,0,0,0);
    }
}
