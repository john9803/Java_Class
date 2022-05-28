package engine;

import constants.Constants;
import state.GlobalState;

import javax.swing.*;

public class Painter extends JFrame {


    public Painter(){

    }

    public void init() {
        this.setTitle(Constants.MAIN_FRAME_TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);




    }

    public void switchField(){
        this.add(GlobalState.globalState.currentField);
        this.pack();

        GlobalState.globalState.currentField.setFocusable(true);
        GlobalState.globalState.currentField.requestFocusInWindow();

    }



}
