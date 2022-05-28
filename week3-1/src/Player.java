public class Player {

    private int hp;
    private int att;
    private int def;

    public Player (int hp, int att, int def) { // 생성자 -> 리턴타입이 없다!
        this.hp = hp;
        this.att = att;
        this.def = def;
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
        String str = ">Player\n";
        str += ("\thp: " + this.hp + "\n" );
        str += ("\tatt: " + this.att + "\n" );
        str += ("\tdef: " + this.def + "\n" );
        return str; // 객체의 정보를 요약해서 문자열로 반환하는 기능을 함!
    }
}
