public class App {
    public static void main(String[] args) throws Exception {
        // abstract =   abstract classes cannot be instantiated, but they can have a subclass
        //              abstract methods are declared without an implementation
        //              keyword prevents someone from making a vague instance of a class

        Car car = new Car();
        car.go();

        // Vehicle vehicle = new Vehicle();
    }
}
