
public class App {
    public static void main(String[] args) throws Exception {
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        myCar1.drive();
        myCar1.brake();

        System.out.println();

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        myCar2.drive();
        myCar2.brake();
    }
}
