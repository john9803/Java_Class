package gameobject;

import constants.Constants;

import java.awt.*;

public class Unit {

    protected int x;
    protected int y;

    public Unit(){

    }

    public Unit(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void init(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Rectangle getObject() {
        return new Rectangle(
                this.x, this.y,
                Constants.UNIT_WIDTH, Constants.UNIT_HEIGHT);
    }

    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D)  g;
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.draw(this.getObject());
    }



}
