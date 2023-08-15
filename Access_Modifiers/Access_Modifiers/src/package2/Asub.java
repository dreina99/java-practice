package package2;
import package1.*;

public class Asub extends A {
    public static void main(String[] args) {

        Asub asub = new Asub();

        // Asub can access A's protected message since it is a subclass of A
        System.out.println(asub.protectedMessage);

    }
}
