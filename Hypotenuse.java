import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of x?");
        double x = Double.parseDouble(scanner.nextLine());

        System.out.println("What is the length of y?");
        double y = Double.parseDouble(scanner.nextLine());

        double hyp = Math.sqrt(x*x + y*y);
        System.out.println("Hypotenuse: " + hyp);

        scanner.close();
    }
}
