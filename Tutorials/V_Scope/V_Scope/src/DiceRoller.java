import java.util.Random;

public class DiceRoller {
    Random random = new Random();
    int number = 0;

    DiceRoller() {
        roll();
    }

    void roll() {
        // need plus 1 so 0-5 -> 1-6
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}