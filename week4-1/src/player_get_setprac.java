import java.util.Scanner;

public class player_get_setprac {
    private int hp;
    private int att;
    private int def;

    public player_get_setprac(int hp, int att, int def){
        this.hp = hp;
        this.att = att;
        this.def = def;
    }

    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in); // 키보드 객체 선언
        int i = keyboard.nextInt();

        System.out.println("hi");

    }



}
