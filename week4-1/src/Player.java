import java.util.Random;

public class Player {

    private int hp;
    private int att;
    private int def;

    public Player (int hp, int att, int def) {
        this.hp = hp;
        this.att = att;
        this.def = def;
    }

    public void fight(Dragon dragon) {
        Random random = new Random();

        System.out.println("Fight with the dragon!!");
        boolean isCritical = random.nextBoolean();
        int damage = Utils.max(this.getAtt() * (isCritical ? 2 : 1) - dragon.getDef(), 0);
        System.out.println("hit the dragon with " + damage + " att");
        dragon.setHp(Utils.max(dragon.getHp() - damage, 0));
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return this.def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtt() {
        return this.att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public String toString() {
        String str = "> Player\n";
        str += ("\thp: " + this.hp + "\n");
        str += ("\tatt: " + this.att + "\n");
        str += ("\tdef: " + this.def);
        return str;
    }

}
