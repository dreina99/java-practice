public class App {
    public static void main(String[] args) throws Exception {
        
        Human human1 = new Human("Devin", 23, 150);
        Human human2 = new Human("Morty", 16, 100);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
    }
}
