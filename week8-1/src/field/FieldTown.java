package field;

import gameobject.Dragon;
import state.GlobalState;

import javax.swing.*;
import java.awt.*;

public class FieldTown extends JPanel {
    // JPanel도 마찬가지로 Java라이브러리임. JFrame안에 JPanel이 들어가게됨


    public FieldTown(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
         //Dimension은 가로와 세로값을 전달받는다.
        this.setBackground(Color.GREEN);
        // JPanel은 아무것도 색이 설정되어있지 않음. 그래서 background설정을 해준다.
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (GlobalState.globalState.player != null){
            GlobalState.globalState.player.draw(g);
        }

        for (Dragon dragon: GlobalState.globalState.dragons) {
            if (dragon != null) {
                dragon.draw(g);

            }
        }

    }
}
