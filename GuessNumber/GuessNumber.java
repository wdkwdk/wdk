public class GuessNumber {
    player p1;
    player p2;
    player p3;

    public void StartGame() {
        p1 = new player();
        p2 = new player();
        p3 = new player();

        int numberp1 = 0;
        int numberp2 = 0;
        int numberp3 = 0;
        int Numberguesses = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = 0;
        targetNumber = (int) (Math.random() * 100);
        System.out.println("The number is between 0 and 100");
        while (true) {
            Numberguesses ++;
            System.out.println("Number to guess is" + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            numberp1 = p1.number;
            System.out.println("p1 guessed" + numberp1);
            numberp2 = p2.number;
            System.out.println("p2 guessed" + numberp2);
            numberp3 = p3.number;
            System.out.println("p3 guessed" + numberp3);

            if (numberp1 == targetNumber) {
                p1isRight = true;
            }
            if (numberp2 == targetNumber) {
                p2isRight = true;
            }
            if (numberp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("p1 is right?" + p1isRight);
                System.out.println("p2 is right?" + p2isRight);
                System.out.println("p3 is right?" + p3isRight);
                System.out.println("Game over");
                System.out.println("Number of guesses are "+Numberguesses);
                break;
            } else {
                System.out.println("Try again");
            }

        }
    }

    public class player {
        int number = 0;

        public void guess() {
            number = (int) (Math.random() * 100);
            System.out.println("I guess" + number);
        }
    }

    public class GameLauncher{
        public static void main(String[] args) {
            GuessNumber game = new GuessNumber();
            game.StartGame();
        }
    }
}
