package package2;
import package1.*;

// class C must be public to be available globally
public class C {
    
    // no access modifier
    // only available to same package
    String defaultMessage = "This is the default";

    // public access modifier available globally
    public String publicMessage = "This is public";

    private String privateMessage = "This is private";
}
