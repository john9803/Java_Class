import java.util.Random;
import java.util.Scanner;

public class AppWeek3 {

    public static int max(int a, int b) {
        return a > b ? a: b;
    } // 음수가 되는것을 막아준다

    public static int min(int a, int b) {
        return a < b ? b : a;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // System.in means input by keyboard
        Random random = new Random();

        Player player = new Player(80, 15, 8); // player클래스의 생성사 호출
        Dragon dragon = new Dragon(100, 15, 10);
        //int dragonHp = 100;
        //int dragonAtt = 15;
        //int dragonDef = 10;

        int damage = 0;
        boolean inCritical = false;

        while(true){
            System.out.println("status=========================");
            System.out.println("> Dragon");
            System.out.println("\thp: " + dragon.getHp()); // \t makes tab escape code
            System.out.println("\tatt: " + dragon.getAtt());
            System.out.println("\tdef: " + dragon.getDef());
            System.out.println(" >Player");
            System.out.println("\thp: " + player.getHp());
            System.out.println("\tatt: " + player.getAtt());
            System.out.println("\tdef: " + player.getDef());
            System.out.println("===============================");
            System.out.println("menu===========================");
            System.out.println("1. fight");
            System.out.println("2. defense");
            System.out.println("3. exit");
            System.out.println("===============================");
            System.out.print("> ");

            int chosen = scan.nextInt();
            switch (chosen){
                case 1:
                    System.out.println("Fight with the dragon!!");
                    boolean isCritical = random.nextBoolean();
                    damage = max(player.getAtt() * (isCritical ? 2 : 1) - dragon.getDef(), 0); //조건 연산자의 의미를 가지며 ? 2:1은 참이면 2 거짓이면 1 반환
                    System.out.println("hit the dragon with " + damage + " att");
                    //dragon.getHp() -= damage;
                    //dragon.getHp() = max(dragon.getHp(), 0);
                    dragon.setHp(max(dragon.getHp() - damage,0));

                    boolean counterAtt = random.nextBoolean();
                    if (counterAtt){
                        System.out.println("Dragon got raged!");
                        isCritical = random.nextBoolean();
                        max( damage = dragon.getAtt() * (isCritical ? 2 : 1)- player.getDef(), 0);
                        System.out.println("got " + damage + "damages");
//                        playerHp -= damage;
//                        playerHp = max(playerHp, 0);
                        player.setHp(max(player.getHp() - damage, 0));


                    }
                    break;
                case 2:
                    System.out.println("defense!!!");

//                    playerDef *= 2;

                    player.setDef(player.getDef() *  2);

                    System.out.println("Dragon got raged!");
                    isCritical = random.nextBoolean();
                    max( damage = dragon.getAtt() * (isCritical ? 2 : 1)- player.getHp(), 0);
                    System.out.println("got " + damage + "damages");
                    //player.getHp() -= damage;
                    //playerHp = max(playerHp, 0);

//                    playerDef /= 2;
                    player.setDef(player.getDef() / 2);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input!!!");
                    break;

            }

            if ( player.getHp() <= 0 ) {
                System.out.println("Player was killed. The dragon in too strong...");
                break;
            } else if ( dragon.getHp() <= 0) {
                System.out.println(" player win!");
                break;
            }
        }

    }
}
