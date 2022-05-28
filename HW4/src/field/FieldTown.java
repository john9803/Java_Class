package field;

import constants.Constants;
import state.GlobalState;

import javax.swing.*;
import java.awt.*;

public class FieldTown extends JPanel {

    public FieldTown(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));

        this.setBackground(Color.ORANGE);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for (int x=0;x<500;x+=50){
            for (int y=0;y<500;y+=50){
                if(!((x>49 && x<450) && (y>49 && y<450))){
                    g.drawRect(x, y, Constants.UNIT_WIDTH, Constants.UNIT_HEIGHT);
                }
            }
        }








    }

}
