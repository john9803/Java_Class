package engine;

import constants.Constants;
import state.GlobalState;

import javax.swing.*;

public class Painter extends JFrame {
    // 화면에 보여주는 윈도우 역할
    // Frame과 Panel등을 컴포넌트라고 한다.
    // 컴포넌트는 자식 컴포넌트를 추가할 때, add 메소드를 사용한다.

    public Painter() {

    }

    public void init() {
        this.setTitle(Constants.MAIN_FRAME_TITLE);
        //JFrame안에 setTitle이라는 메소드는 JFrame을 상속받았기 때문에 사용이 가능함 this로 메소드사용가능
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // GUI닫기 버튼을 눌렀을 때 꺼주는기능. 디폴트는 눌러도 안꺼지는 걸로 되어있어서 바꿔줘야함!
        this.setVisible(true); // 객체를 만들어도 표시가 안되는 것을 화면에 표시가 되게 만들어줌.

    }

    public void switchField(InputGetter inputGetter) {
        // 필드를 많이 만들었을 때를 대비하여 만듬
        this.add(GlobalState.globalState.currentField); // JFrame 등은 컴포넌트라고함.
        this.pack(); // Frame의 크기를 Panel에 딱 달라붙게 만들어 주는 pack메소드.

        GlobalState.globalState.currentField.addKeyListener(inputGetter);
        GlobalState.globalState.currentField.setFocusable(true);
        GlobalState.globalState.currentField.requestFocusInWindow();


    }

    public void repaintDisplay() {

    }


}
