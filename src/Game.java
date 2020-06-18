
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int counter, guess, number;
        do {

            counter = 0;
            guess = -1;
            number = random.nextInt(10);
            while (counter < 3 && guess != number) {
                System.out.printf("Guess(%d) the number 0..10:", 3 - counter);
                guess = scanner.nextInt();
                if (guess != number) {
                    System.out.println("Your number is " + (guess < number ? "less" : "greater"));
                    counter++;
                }
            }
            System.out.println("You" + (guess == number ? "WON!" : "Lose:" + number));
            System.out.println("Repeat game? Yes-1, No-2");
        }while (scanner.nextInt()==1);
    }
}