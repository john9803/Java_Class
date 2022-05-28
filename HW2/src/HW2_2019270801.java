import java.util.Scanner;

public class HW2_2019270801 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int roll_num = 0;

        int x = 0;
        int y = 0;


        Player player = new Player(0, 0, 0, 0);
        Computer computer = new Computer(0, 0, 0, 0);


        String[][] score = new String[10][10];

        System.out.println("start the game");

        // painter
        while (player.getLap_num() < 3 || computer.getLap_num() < 3) {
            System.out.println("player turn");
            for (y = 0; y <= 9; y++) {
                for (x = 0; x <= 9; x++) {
                    //if (x >= 1 && x <= 8 && y >= 1 && y <= 8) {
                    if (x > 0 && x < 9 && y > 0 && y < 9) {
                        score[y][x] = "    ";
                        System.out.print(score[y][x]);
                    } else {
                        if (!((x == player.getPosition_x() && y == player.getPosition_y()) || (x == computer.getPosition_x() && y == computer.getPosition_y()))) {
                            score[y][x] = "|  |";
                            System.out.print(score[y][x]);
                        } else if (player.getPosition_x() == computer.getPosition_x() && player.getPosition_y() == computer.getPosition_y()) {
                            score[y][x] = "|pc|";
                            System.out.print(score[y][x]);
                        } else {
                            System.out.print(score[y][x]);
                        }
                    }

                    if (x == 9) {
                        System.out.println("");
                    }
                }
            }


            System.out.print("* how many times will you roll the dice (1~3)? ");
            roll_num = input.nextInt();

            switch (roll_num) {
                //player
                case 1:
                    int diceValue1_1 = (int) (Math.random() * 6) + 1;
                    int avgValue1 = (diceValue1_1) / 1;
                    player.setCnt(player.getCnt() + avgValue1);
                    switch (player.getCnt() / 10) {
                        case 0:
                            player.setPosition_x(player.getCnt());
                            player.setPosition_y(0);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 1:
                            player.setPosition_x(9);
                            player.setPosition_y(player.getCnt() % 10);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 2:
                            player.setPosition_x(9 - (player.getCnt() % 10));
                            player.setPosition_y(9);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 3:
                            player.setPosition_x(0);
                            player.setPosition_y(9 - (player.getCnt() % 10));
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                    }

                    System.out.println("1. dice: " + diceValue1_1);
                    System.out.println("============================");
                    if (player.getCnt() >= 40) { // position renew
                        player.setCnt(player.getCnt() % 40);
                        player.setLap_num(player.getLap_num() + 1);
                        System.out.println("average number: " + avgValue1);
                        System.out.println(player.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("average number: " + avgValue1);
                        System.out.println("============================");
                    }
                    break;
                case 2:
                    int diceValue2_1 = (int) (Math.random() * 6) + 1;
                    int diceValue2_2 = (int) (Math.random() * 6) + 1;
                    int avgValue2 = (diceValue2_1 + diceValue2_2) / 2;
                    player.setCnt(player.getCnt() + avgValue2);
                    switch (player.getCnt() / 10) {
                        case 0:
                            player.setPosition_x(player.getCnt());
                            player.setPosition_y(0);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 1:
                            player.setPosition_x(9);
                            player.setPosition_y(player.getCnt() % 10);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 2:
                            player.setPosition_x(9 - (player.getCnt() % 10));
                            player.setPosition_y(9);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 3:
                            player.setPosition_x(0);
                            player.setPosition_y(9 - (player.getCnt() % 10));
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                    }

                    if (player.getCnt() >= 40) { // position renew
                        player.setCnt(player.getCnt() % 40);
                        player.setLap_num(player.getLap_num() + 1);
                        System.out.println("1. dice: " + diceValue2_1);
                        System.out.println("2. dice: " + diceValue2_2);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue2);
                        System.out.println(player.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("1. dice: " + diceValue2_1);
                        System.out.println("2. dice: " + diceValue2_2);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue2);
                        System.out.println("============================");
                    }
                    break;

                case 3:
                    int diceValue3_1 = (int) (Math.random() * 6) + 1;
                    int diceValue3_2 = (int) (Math.random() * 6) + 1;
                    int diceValue3_3 = (int) (Math.random() * 6) + 1;
                    int avgValue3 = (diceValue3_1 + diceValue3_2 + diceValue3_3) / 3;
                    player.setCnt(player.getCnt() + avgValue3);

                    switch (player.getCnt() / 10) {
                        case 0:
                            player.setPosition_x(player.getCnt());
                            player.setPosition_y(0);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 1:
                            player.setPosition_x(9);
                            player.setPosition_y(player.getCnt() % 10);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 2:
                            player.setPosition_x(9 - (player.getCnt() % 10));
                            player.setPosition_y(9);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 3:
                            player.setPosition_x(0);
                            player.setPosition_y(9 - (player.getCnt() % 10));
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                    }

                    if (player.getCnt() >= 40) { // position renew
                        player.setCnt(player.getCnt() % 40);
                        player.setLap_num(player.getLap_num() + 1);
                        System.out.println("1. dice: " + diceValue3_1);
                        System.out.println("2. dice: " + diceValue3_2);
                        System.out.println("3. dice: " + diceValue3_3);
                        System.out.println("============================");

                        System.out.println("average number: " + avgValue3);
                        System.out.println(player.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("1. dice: " + diceValue3_1);
                        System.out.println("2. dice: " + diceValue3_2);
                        System.out.println("3. dice: " + diceValue3_3);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue3);
                        System.out.println("============================");
                    }


            }
            //Computer
            roll_num = (int) (Math.random() * 3 + 1);
            System.out.print("* how many times will you roll the dice (1~3)? " + roll_num + "\n");


            System.out.println("computer turn");
            for (y = 0; y <= 9; y++) {
                for (x = 0; x <= 9; x++) {
                    if (x > 0 && x < 9 && y > 0 && y < 9) {
                        score[y][x] = "    ";
                        System.out.print(score[y][x]);
                    } else {
                        if (!((x == player.getPosition_x() && y == player.getPosition_y()) || (x == computer.getPosition_x() && y == computer.getPosition_y()))) {
                            score[y][x] = "|  |";
                            System.out.print(score[y][x]);
                        } else if (player.getPosition_x() == computer.getPosition_x() && player.getPosition_y() == computer.getPosition_y()) {
                            score[y][x] = "|pc|";
                            System.out.print(score[y][x]);
                        } else {
                            System.out.print(score[y][x]);
                        }
                    }
                    if (x == 9) {
                        System.out.println("");
                    }
                }
            }

            switch (roll_num) {
                //computer
                case 1:
                    int diceValue1_1 = (int) (Math.random() * 6) + 1;
                    int avgValue1 = (diceValue1_1) / 1;
                    computer.setCnt(computer.getCnt() + avgValue1);
                    switch (computer.getCnt() / 10) {
                        case 0:
                            computer.setPosition_x(computer.getCnt());
                            computer.setPosition_y(0);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 1:
                            computer.setPosition_x(9);
                            computer.setPosition_y(computer.getCnt() % 10);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 2:
                            computer.setPosition_x(9 - (computer.getCnt() % 10));
                            computer.setPosition_y(9);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 3:
                            computer.setPosition_x(0);
                            computer.setPosition_y(9 - (computer.getCnt() % 10));
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                    }


                    if (computer.getCnt() >= 40) { // position renew
                        computer.setCnt(player.getCnt() % 40);
                        computer.setLap_num(computer.getLap_num() + 1);
                        System.out.println("1. dice: " + diceValue1_1);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue1);
                        System.out.println(computer.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("1. dice: " + diceValue1_1);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue1);
                        System.out.println("============================");
                    }
                    break;

                case 2:
                    int diceValue2_1 = (int) (Math.random() * 6) + 1;
                    int diceValue2_2 = (int) (Math.random() * 6) + 1;
                    int avgValue2 = (diceValue2_1 + diceValue2_2) / 2;
                    computer.setCnt(computer.getCnt() + avgValue2);
                    switch (computer.getCnt() / 10) {
                        case 0:
                            computer.setPosition_x(computer.getCnt());
                            computer.setPosition_y(0);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 1:
                            computer.setPosition_x(9);
                            computer.setPosition_y(computer.getCnt() % 10);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 2:
                            computer.setPosition_x(9 - (computer.getCnt() % 10));
                            computer.setPosition_y(9);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 3:
                            computer.setPosition_x(0);
                            computer.setPosition_y(9 - (computer.getCnt() % 10));
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;

                    }


                    if (computer.getCnt() >= 40) { // position renew
                        computer.setCnt(player.getCnt() % 40);
                        computer.setLap_num(computer.getLap_num() + 1);
                        System.out.println("1. dice: " + diceValue2_1);
                        System.out.println("2. dice: " + diceValue2_2);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue2);
                        System.out.println(computer.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("1. dice: " + diceValue2_1);
                        System.out.println("2. dice: " + diceValue2_2);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue2);
                        System.out.println("============================");
                    }
                    break;

                case 3:
                    int diceValue3_1 = (int) (Math.random() * 6) + 1;
                    int diceValue3_2 = (int) (Math.random() * 6) + 1;
                    int diceValue3_3 = (int) (Math.random() * 6) + 1;

                    int avgValue3 = (diceValue3_1 + diceValue3_2 + diceValue3_3) / 3;
                    computer.setCnt(computer.getCnt() + avgValue3);
                    switch (computer.getCnt() / 10) {
                        case 0:
                            computer.setPosition_x(computer.getCnt());
                            computer.setPosition_y(0);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 1:
                            computer.setPosition_x(9);
                            computer.setPosition_y(computer.getCnt() % 10);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 2:
                            computer.setPosition_x(9 - (computer.getCnt() % 10));
                            computer.setPosition_y(9);
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                        case 3:
                            computer.setPosition_x(0);
                            computer.setPosition_y(9 - (computer.getCnt() % 10));
                            score[player.getPosition_y()][player.getPosition_x()] = "|p |";
                            score[computer.getPosition_y()][computer.getPosition_x()] = "| c|";
                            break;
                    }


                    if (computer.getCnt() >= 40) { // position renew
                        computer.setCnt(player.getCnt() % 40);
                        computer.setLap_num(computer.getLap_num() + 1);
                        System.out.println("1. dice: " + diceValue3_1);
                        System.out.println("2. dice: " + diceValue3_2);
                        System.out.println("3. dice: " + diceValue3_3);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue3);
                        System.out.println(computer.getLap_num() + "th round complete!");
                        System.out.println("============================");
                    } else {
                        System.out.println("1. dice: " + diceValue3_1);
                        System.out.println("2. dice: " + diceValue3_2);
                        System.out.println("3. dice: " + diceValue3_3);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue3);
                        System.out.println("============================");
                    }

                    if (player.getLap_num() == 3) { // Exit condition, when lap_num is 3
                        System.out.println("Player win!");
                        break;
                    } else if (computer.getLap_num() == 3) {
                        System.out.println("Computer win!");
                        break;
                    }


            }
//            if (player.getLap_num() == 3) { // Exit condition, when lap_num is 3
//                System.out.println("Player win!");
//                break;
//            }
//            else if (computer.getLap_num() == 3 ){
//                System.out.println("Computer win!");
//                break;
//            }

        }

    }
}



//System.out.print("player_position_y: " + player_position_y + " player_position_x: " + player_position_x + " player_cnt: " + player_cnt + "\n");
//System.out.print("computer_position_y: " + computer_position_y + " computer_position_x: " + computer_position_x + " computer_cnt: " + computer_cnt + "\n");