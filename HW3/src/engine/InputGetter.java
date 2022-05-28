package engine;

import state.Gstate;

import java.util.Scanner;

public class InputGetter {
    private Scanner scanner;
    private Gstate gstate;
    public void init(Gstate gstate) {
        this.gstate = gstate;
    }

    public int player_input_num(){
        Scanner input = new Scanner(System.in);
        System.out.print("* how many times will you roll the dice (1~3)? ");
        int roll_num = input.nextInt();
        System.out.print("\n");

        return roll_num;
    }

    public int computer_input_num(){
        int roll_num = (int) (Math.random() * 3 + 1);
        System.out.print("* how many times will you roll the dice (1~3)? ");

        return roll_num;

    }

}
