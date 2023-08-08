public class App {
    public static void main(String[] args) throws Exception {

        Garage garage = new Garage();
        
        Car car1 = new Car("Honda");
        Car car2 = new Car("Mercedes");

        garage.park(car1);
        garage.park(car2);

    }
}
