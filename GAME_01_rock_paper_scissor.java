package Company;
import java.util.Random;
import java.util.Scanner;
public class GAME_01_rock_paper_scissor {


    public static void main(String[] args) {

        int UserChoice;
        int ComputerChoice;
        int rock, paper, scissors;

        Scanner input = new Scanner(System.in);//delcare kel input
        Random rnd = new Random();//cpmputer choice random
//Assign the value
        rock = 0;
        paper = 1;
        scissors = 2;
//Display the game
        System.out.println("0-->Rock\n1-->Paper\n2-->Scissors");
        System.out.println("please choose your input");

        //declare kel ki userchoice la input ghenar
        UserChoice = input.nextInt();
        while (UserChoice > 2) {
            System.out.println("Please Choose between 0 and 2");
            UserChoice = input.nextInt();
        }
        //Userchoice input decalre

        if (UserChoice == rock) {
            System.out.println("User Choiceis : Rock");
        } else if (UserChoice == paper) {
            System.out.println("User Choice is : Paper");
        } else if (UserChoice == scissors) {
            System.out.println("User Choice is : Scissors");
        }

//Computer Choice

        ComputerChoice = rnd.nextInt(2);
//computer selection
//Display
        if (ComputerChoice == rock) {
            System.out.println("Computer  Choice is : Rock ");
        } else if (ComputerChoice == paper) {
            System.out.println("Computer Choice is: Paper ");
        } else if (ComputerChoice == scissors) {
            System.out.println("Computer Choice is: Scissor");
        }

        while (UserChoice == ComputerChoice) {
            System.out.println("Draw please try again");

            UserChoice = input.nextInt();
            while (UserChoice > 2) {
                System.out.println("Please Choose between 0 and 2");
                UserChoice = input.nextInt();
            }
            //Userchoice input decalre

            if (UserChoice == rock) {
                System.out.println("User Choiceis : Rock");
            } else if (UserChoice == paper) {
                System.out.println("User Choice is : Paper");
            } else if (UserChoice == scissors) {
                System.out.println("User Choice is : Scissors");
            }
//Computer Choice
            ComputerChoice = rnd.nextInt(2);
//computer selection

            if (ComputerChoice == rock) {
                System.out.println("Computer  Choice is : Rock ");
            } else if (ComputerChoice == paper) {
                System.out.println("Computer Choice is: Paper ");
            } else if (ComputerChoice == scissors) {
                System.out.println("Computer Choice is: Scissor");
            }
        }
        //RESULT
        if (ComputerChoice == rock) {
            if (UserChoice == paper) {
                System.out.println("You Win the game");
            } else {
                System.out.println("'Computer wins");
            }

        }
        else if (ComputerChoice == paper) {
            if (UserChoice == rock) {
                System.out.println("Computer wins ");
            } else {
                System.out.println("You win the game");
            }
        } else if (UserChoice == rock) {
            System.out.println("You win the game");
        }
        else {
            System.out.println("Computer wins the game");
        }
    }
}