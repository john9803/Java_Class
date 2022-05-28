import java.util.Random;
import java.util.Scanner;

public class AppWeek4 {

    public static void main(String[] args) {
        Engine engine = Engine.getInstance();  // singleton pattern ( 디자인패턴 중에 하나 )
        engine.init();
        engine.run();
    }
}



        ///////////////////////////////////////////////////// 이 아래로 다 없앨거임
        // GlobalState 로
//        Player player = new Player(80, 15, 8); // player클래스의 생성자 호출
//        Dragon dragon = new Dragon(100, 15, 10);

       // while(true){
            // painter 로
//            System.out.println("status=========================");
//            System.out.println(dragon.toString());
//            System.out.println(player.toString());
//            System.out.println("===============================");
//            System.out.println("menu===========================");
//            System.out.println("1. fight");
//            System.out.println("2. defense");
//            System.out.println("3. exit");
//            System.out.println("===============================");
//            System.out.print("> ");

       //     int chosen = scan.nextInt();
            // Updater/update 로
//            switch (chosen){
//                case 1:
//                    player.fight(dragon);// player fight
//
//                    boolean counterAtt = random.nextBoolean();
//                    if (counterAtt){
//                       dragon.fight(player);// dragon fight
//                    }
//                    break;
//                case 2:
//                    System.out.println("defense!!!");
//
//                    player.setDef(player.getDef() *  2);
//                    dragon.fight(player);
//                    player.setDef(player.getDef() / 2);
//                    break;
//                case 3:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Wrong input!!!");
//                    break;
//
//            }
                // updater/checktermination 으로
//            if ( player.getHp() <= 0 ) {
//                System.out.println("Player was killed. The dragon in too strong...");
//                break;
//            } else if ( dragon.getHp() <= 0) {
//                System.out.println(" player win!");
//                break;
//            }
//        }

//    }
//}
