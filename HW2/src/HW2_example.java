import java.util.Scanner;

public class HW2_example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int roll_num = 0;


        int player_cnt = 0;
        int player_position_x = 0;
        int player_position_y = 0;
        int player_lap_num = 0;

        int computer_cnt = 0;
        int computer_position_x = 0;
        int computer_position_y = 0;
        int computer_lap_num = 0;

        String[][] score = new String[10][10];

        System.out.println("start the game");

        while(player_lap_num < 3 || computer_lap_num < 3) {

            System.out.println("player turn");
            for (int y = 0; y <= 9; y++) {
                for (int x = 0; x <= 9; x++) {
                    if (x >= 1 && x <= 8 && y >= 1 && y <= 8) {
                        score[y][x] = "    ";
                        System.out.print(score[y][x]);
                    } else {
                        if (!((x == player_position_x && y == player_position_y) || (x == computer_position_x && y == computer_position_y))) {
                            score[y][x] = "|  |";
                            System.out.print(score[y][x]);
                        } else if (player_position_x == computer_position_x && player_position_y == computer_position_y) {
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
                    player_cnt += avgValue1;
                    switch (player_cnt / 10) {
                        case 0:
                            player_position_x = player_cnt;
                            player_position_y = 0;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 1:
                            player_position_x = 9;
                            player_position_y = player_cnt % 10;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 2:
                            player_position_x = 9 - (player_cnt % 10);
                            player_position_y = 9;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 3:
                            player_position_x = 0;
                            player_position_y = 9 - (player_cnt % 10);
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                    }

                    System.out.println("1. dice: " + diceValue1_1);
                    System.out.println("============================");
                    if (player_cnt >= 40) { // Player position renew
                        player_cnt = player_cnt % 40;
                        player_lap_num += 1;
                        System.out.println("average number: " + avgValue1);
                        System.out.println(player_lap_num + "th round complete!");
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
                    player_cnt += avgValue2;
                    switch (player_cnt / 10) {
                        case 0:
                            player_position_x = player_cnt;
                            player_position_y = 0;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 1:
                            player_position_x = 9;
                            player_position_y = player_cnt % 10;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 2:
                            player_position_x = 9 - (player_cnt % 10);
                            player_position_y = 9;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 3:
                            player_position_x = 0;
                            player_position_y = 9 - (player_cnt % 10);
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                    }

                    if (player_cnt >= 40) { // Player position renew
                        player_cnt = player_cnt % 40;
                        player_lap_num += 1;
                        System.out.println("1. dice: " + diceValue2_1);
                        System.out.println("2. dice: " + diceValue2_2);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue2);
                        System.out.println(player_lap_num + "th round complete!");
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
                    player_cnt += avgValue3;

                    switch (player_cnt / 10) {
                        case 0:
                            player_position_x = player_cnt;
                            player_position_y = 0;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 1:
                            player_position_x = 9;
                            player_position_y = player_cnt % 10;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 2:
                            player_position_x = 9 - (player_cnt % 10);
                            player_position_y = 9;
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                        case 3:
                            player_position_x = 0;
                            player_position_y = 9 - (player_cnt % 10);
                            score[player_position_y][player_position_x] = "|p |";
                            score[computer_position_y][computer_position_x] = "| c|";
                            break;
                    }

                    if (player_cnt >= 40) { // Player position renew
                        player_cnt = player_cnt % 40;
                        player_lap_num += 1;
                        System.out.println("1. dice: " + diceValue3_1);
                        System.out.println("2. dice: " + diceValue3_2);
                        System.out.println("3. dice: " + diceValue3_3);
                        System.out.println("============================");

                        System.out.println("average number: " + avgValue3);
                        System.out.println(player_lap_num + "th round complete!");
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
            roll_num = (int) (Math.random() * 3) + 1;
            System.out.print("* how many times will you roll the dice (1~3)? "+roll_num+"\n");


            System.out.println("computer turn");
            for (int y = 0; y <= 9; y++) {
                for (int x = 0; x <= 9; x++) {
                    if (x >= 1 && x <= 8 && y >= 1 && y <= 8) {
                        score[y][x] = "    ";
                        System.out.print(score[y][x]);
                    } else {
                        if (!((x == player_position_x && y == player_position_y) || (x == computer_position_x && y == computer_position_y))) {
                            score[y][x] = "|  |";
                            System.out.print(score[y][x]);
                        } else if (player_position_x == computer_position_x && player_position_y == computer_position_y) {
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
                    computer_cnt += avgValue1;
                    switch (computer_cnt / 10) {
                        case 0:
                            computer_position_x = computer_cnt;
                            computer_position_y = 0;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 1:
                            computer_position_x = 9;
                            computer_position_y = computer_cnt % 10;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 2:
                            computer_position_x = 9 - (computer_cnt % 10);
                            computer_position_y = 9;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 3:
                            computer_position_x = 0;
                            computer_position_y = 9 - (computer_cnt % 10);
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                    }


                    if (computer_cnt >= 40) { // Player position renew
                        computer_cnt = computer_cnt % 40;
                        computer_lap_num += 1;
                        System.out.println("1. dice: " + diceValue1_1);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue1);
                        System.out.println(computer_lap_num + "th round complete!");
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
                    computer_cnt += avgValue2;
                    switch (computer_cnt / 10) {
                        case 0:
                            computer_position_x = computer_cnt;
                            computer_position_y = 0;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 1:
                            computer_position_x = 9;
                            computer_position_y = computer_cnt % 10;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 2:
                            computer_position_x = 9 - (computer_cnt % 10);
                            computer_position_y = 9;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 3:
                            computer_position_x = 0;
                            computer_position_y = 9 - (computer_cnt % 10);
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;

                    }


                    if (computer_cnt >= 40) { // Player position renew
                        computer_cnt = computer_cnt % 40;
                        computer_lap_num += 1;
                        System.out.println("1. dice: " + diceValue2_1);
                        System.out.println("2. dice: " + diceValue2_2);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue2);
                        System.out.println(computer_lap_num + "th round complete!");
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
                    computer_cnt += avgValue3;
                    switch (computer_cnt / 10) {
                        case 0:
                            computer_position_x = computer_cnt;
                            computer_position_y = 0;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 1:
                            computer_position_x = 9;
                            computer_position_y = computer_cnt % 10;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 2:
                            computer_position_x = 9 - computer_cnt % 10;
                            computer_position_y = 9;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                        case 3:
                            computer_position_x = 0;
                            computer_position_y = 9 - computer_cnt % 10;
                            score[computer_position_y][computer_position_x] = "| c|";
                            score[player_position_y][player_position_x] = "|p |";
                            break;
                    }


                    if (computer_cnt >= 40) { // Player position renew
                        computer_cnt = computer_cnt % 40;
                        computer_lap_num += 1;
                        System.out.println("1. dice: " + diceValue3_1);
                        System.out.println("2. dice: " + diceValue3_2);
                        System.out.println("3. dice: " + diceValue3_3);
                        System.out.println("============================");
                        System.out.println("average number: " + avgValue3);
                        System.out.println(computer_lap_num + "th round complete!");
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
        if (player_lap_num == 3) { // Exit condition, when lap_num is 3
            System.out.println("Player win!");
            break;
            }
        else if (computer_lap_num == 3 ){
            System.out.println("Computer win!");
            break;
            }

        }

    }
}


//System.out.print("player_position_y: " + player_position_y + " player_position_x: " + player_position_x + " player_cnt: " + player_cnt + "\n");
//System.out.print("computer_position_y: " + computer_position_y + " computer_position_x: " + computer_position_x + " computer_cnt: " + computer_cnt + "\n");