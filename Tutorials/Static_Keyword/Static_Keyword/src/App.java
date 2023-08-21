public class App {
    public static void main(String[] args) throws Exception {
        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member. One copy shared throughout all
        //          instances of the class.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        // numberOfFriends is static -> owned by the class itself
        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();

        // Math.round(a) is a good example of a real world static method
    }

}
