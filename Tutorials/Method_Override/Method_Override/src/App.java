public class App {
    public static void main(String[] args) throws Exception {
        // method overriding =  declaring a method in a sub class,
        //                      which is already present in the parent class
        //                      done so that a child class can give its own implementation
        Dog dog = new Dog();
        Animal animal = new Animal();

        animal.speak();
        dog.speak();
    }
}
