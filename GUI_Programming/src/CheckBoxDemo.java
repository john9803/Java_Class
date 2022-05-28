import javax.swing.*;
import java.awt.*;


    public class CheckBoxDemo extends JFrame {

        public CheckBoxDemo() {
            setSize(250, 100);
            setTitle("CheckBox Example");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            Container contentPane = getContentPane();
            contentPane.setLayout(new FlowLayout());
            JCheckBox check1 = new JCheckBox("체크박스 1");
            JCheckBox check2 = new JCheckBox("체크박스 2");
            contentPane.add(check1);
            contentPane.add(check2);


        }

        public static void main(String[] args) {
            (new CheckBoxDemo()).setVisible(true);
        }
    }


