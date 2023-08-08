public class Methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        String name = "Devin";
        int age = 23;

        // main is static so hello also has to be static
        hello(name, age);  

        int x = 3;
        int y = 4;

        System.out.println(add(x, y));
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
    }

    static int add(int a, int b) {
        return a + b;
    }
}
