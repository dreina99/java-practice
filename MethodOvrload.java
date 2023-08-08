public class MethodOvrload {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature

        System.out.println(add(3, 4));
        System.out.println(add(3, 4, 5));
        System.out.println(add(3, 4, 5, 6));

        System.out.println(add(3.1, 4));
        System.out.println(add(3.1, 4, 5));
        System.out.println(add(3.1, 4, 5, 6));
    }

    static int add(int x, int y) {
        System.out.println("This is overloaded method 1");
        return x + y;
    }

    static int add(int x, int y, int z) {
        System.out.println("This is overloaded method 2");
        return x + y + z;
    }

    static int add(int w, int x, int y, int z) {
        System.out.println("This is overloaded method 3");
        return w + x + y + z;
    }

    static double add(double x, double y) {
        System.out.println("This is overloaded method 1");
        return (x + y);
    }

    static double add(double x, double y, double z) {
        System.out.println("This is overloaded method 2");
        return (x + y + z);
    }

    static double add(double w, double x, double y, double z) {
        System.out.println("This is overloaded method 3");
        return (w + x + y + z);
    }
}
