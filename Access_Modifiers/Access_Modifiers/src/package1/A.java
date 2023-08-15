package package1;
import package2.*;

public class A {

    protected String protectedMessage = "This is protected.";
    public static void main(String[] args) {
        
        C c = new C();

        /*will not work, default modifiers must be in same package
        System.out.println(c.defaultMessage);*/

        System.out.println(c.publicMessage);

        B b = new B();
        /* will not work -> only B has access to its private variables
        System.out.println(b.privateMessage); */
    }
}
