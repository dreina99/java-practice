import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random();

        // 6 parameter -> 0 - 5
        // 6 parameter + 1 -> 1 - 6
        //int x = random.nextInt(6) + 1;

        // random val between 0 and 1
        //double x = random.nextDouble();

        // rand bool -> true or false
        boolean x = random.nextBoolean();

        System.out.println(x);
    }
}
