package state;

import com.sun.org.apache.bcel.internal.Const;
import constants.Constants;
import field.FieldTown;
import gameobject.Dragon;
import gameobject.Player;

import java.util.Random;

public class GlobalState {
    public static GlobalState globalState = new GlobalState();
    // 싱글톤 객체만듬
    public FieldTown currentField;

    public Player player;

    public Dragon[] dragons;

    public GlobalState () {
        this.currentField = new FieldTown(
                Constants.FIELD_WIDTH,
                Constants.FIELD_HEIGHT);
        // 가로세로 값을 전달해 주어야 한다

        this.player = new Player();
        this.dragons = new Dragon[Constants.MAX_DRAGON];
        for ( int i =0; i < this.dragons.length; ++i){
            this.dragons[i] = new Dragon();
        }
    }

    public void init() {
        Random random = new Random();

        this.player.init(
                Constants.INIT_POS_X,
                Constants.INIT_POS_Y,
                Constants.PLAYER_HP,
                Constants.PLAYER_ATT,
                Constants.PLAYER_DEF
        );

    // for-each, enhanced for 이라 부름
    for (Dragon dragon: this.dragons){
        int x = random.nextInt(Constants.FIELD_WIDTH);
        int y = random.nextInt(Constants.FIELD_HEIGHT);

        dragon.init(x, y, Constants.DRAGON_HP, Constants.DRAGON_ATT, Constants.DRAGON_DEF);

    }

    }
}
