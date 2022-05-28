import java.util.Random;
public class Dragon {

    private int hp;
    private int att;
    private int def;

    public Dragon(int hp, int att, int def) {
        this.hp = hp;
        this.att = att;
        this.def = def;
    }

    public void fight (Player player) {
        Random random = new Random();

        System.out.println("Dragon got raged!");
        boolean isCritical = random.nextBoolean();
        int damage = Utils.max( this.getAtt() * (isCritical ? 2 : 1)- player.getDef(), 0);
        System.out.println("got " + damage + "damages");
        player.setHp(Utils.max(player.getHp() - damage, 0));
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
        String str = "> Dragon\n";
        str += ("\thp: " + this.hp + "\n");
        str += ("\tatt: " + this.att + "\n");
        str += ("\tdef: " + this.def);
        return str;
    }
}