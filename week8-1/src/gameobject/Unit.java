package gameobject;

import constants.Constants;

import java.awt.*;

public class Unit {
    protected int hp;
    protected int att;
    protected int def;
    protected int x;
    protected int y;

    public Unit() {

    }

    public Unit(int x, int y, int hp, int att, int def){
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.att = att;
        this.def = def;

    }

    public void init(int x, int y, int hp, int att, int def) {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.att = att;
        this.def = def;
    }

    public Rectangle getObject() {
        return new Rectangle(
                this.x, this.y,
                Constants.UNIT_WIDTH,Constants.UNIT_HEIGHT);
    }

    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D)  g;
        g2d.setColor(Color.BLACK);
        g2d.draw(this.getObject());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
