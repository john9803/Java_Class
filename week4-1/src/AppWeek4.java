import java.util.Random;
import java.util.Scanner;

public class AppWeek4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // System.in means input by keyboard
        Random random = new Random();

        Player player = new Player(80, 15, 8); // player클래스의 생성사 호출
        Dragon dragon = new Dragon(100, 15, 10);

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
                    player.fight(dragon);// player fight

                    boolean counterAtt = random.nextBoolean();
                    if (counterAtt){
                       dragon.fight(player);// dragon fight
                    }
                    break;
                case 2:
                    System.out.println("defense!!!");

                    player.setDef(player.getDef() *  2);
                    dragon.fight(player);
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
