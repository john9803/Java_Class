import java.util.Scanner;

public class HW1_2019270801 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int position = 0;
        int lap_num = 0;

        System.out.println("start the game in position 0 ");

        while (lap_num < 3) {
            System.out.print("* how many times will you roll the dice (1~3)? ");
            int roll_num = input.nextInt();
            System.out.println("============================" );

            switch(roll_num) {
                case 1:
                    int diceValue1_1 = (int) (Math.random() * 6) + 1;
                    int avgValue1 = (diceValue1_1) / 1;
                    position += avgValue1;
                    System.out.println("1. dice: " + diceValue1_1);
                    System.out.println("============================");
                    if (position >= 20) { // Player position renew
                        position = position % 20;
                        lap_num += 1;
                        System.out.println("average number: " + avgValue1);
                        System.out.println("new position: " + position);
                        System.out.println(lap_num + "th round complete!");
                        System.out.println("============================");
                    }
                    else{
                        System.out.println("average number: " + avgValue1);
                        System.out.println("new position: " + position);
                        System.out.println("============================");
                    }
                    break;

                case 2:
                    int diceValue2_1 = (int) (Math.random() * 6) + 1;
                    int diceValue2_2 = (int) (Math.random() * 6) + 1;
                    int avgValue2 = (diceValue2_1 + diceValue2_2) / 2;
                    System.out.println("1. dice: " + diceValue2_1);
                    System.out.println("2. dice: " + diceValue2_1);
                    System.out.println("============================");
                    position += avgValue2;
                    if (position >= 20) { // Player position renew
                        position = position % 20;
                        lap_num += 1;
                        System.out.println("average number: " + avgValue2);
                        System.out.println("new position: " + position);
                        System.out.println(lap_num + "th round complete!");
                        System.out.println("============================");
                    }
                    else{
                        System.out.println("average number: " + avgValue2);
                        System.out.println("new position: " + position);
                        System.out.println("============================");
                    }
                    break;

                case 3:
                    int diceValue3_1 = (int) (Math.random() * 6) + 1;
                    int diceValue3_2 = (int) (Math.random() * 6) + 1;
                    int diceValue3_3 = (int) (Math.random() * 6) + 1;
                    System.out.println("1. dice: " + diceValue3_1);
                    System.out.println("2. dice: " + diceValue3_2);
                    System.out.println("3. dice: " + diceValue3_3);
                    System.out.println("============================");
                    int avgValue3 = (diceValue3_1 + diceValue3_2 + diceValue3_3) / 3;
                    position += avgValue3;
                    if (position >= 20) { // Player position renew
                        position = position % 20;
                        lap_num += 1;

                        System.out.println("average number: " + avgValue3);
                        System.out.println("new position: " + position);
                        System.out.println(lap_num + "th round complete!");
                        System.out.println("============================");
                    }
                    else{
                    System.out.println("average number: " + avgValue3);
                    System.out.println("new position: " + position);
                    System.out.println("============================");
                    }
                    break;
            }

            if (lap_num == 3) { // Exit condition, when lap_num is 3
                System.out.println("congratulations!");
                break;
            }
        }
    }
}
