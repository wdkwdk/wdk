import java.util.Scanner;
public class GuessGame {

    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Guess a number between 0 and 100");
            int guessNumber = sc.nextInt();
            if (number == guessNumber) {
            System.out.println("WIN!!");
                break;
            } else if (number < guessNumber) {
                System.out.println("BIGGER");
            } else if (number > guessNumber) {
                System.out.println("SMALLER");
            }else {
                System.out.println("Please guess a number between 0 and 100");
            }
        }


    }

}
