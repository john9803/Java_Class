package engine;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputGetter extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        // 입력을 기다리는 listener
        System.out.println("key pressed");
    }

    public InputGetter() {

    }

}
