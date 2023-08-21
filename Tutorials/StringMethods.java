public class StringMethods {
    public static void main(String args[]) {
        String name = "Devin";

        // System.out.println(name.equals("devin"));
        // System.out.println(name.equalsIgnoreCase("devin"));
        
        // int result = name.length();
        // char result = name.charAt(1);
        // int result = name.indexOf('d');
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        String result = name.replace('D', 'K');
        System.out.println(result);
    }
}
