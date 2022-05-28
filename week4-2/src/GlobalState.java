import java.util.Scanner;

public class GlobalState {
    //현재상태

    public Player player;
    public Dragon dragon;

    public GlobalState(){
        this.player = new Player(80, 15, 8); // player클래스의 생성자 호출
        this.dragon = new Dragon(100, 15, 10);
    }


}
