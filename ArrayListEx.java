import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        // Array List = resizable array
        //              elements can be added and removed after compilation phase
        //              store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("burger");
        food.add("hot dog");

        food.set(0, "pasta");
        food.remove(2);

        // use .size() instead of .length()
        for(int i = 0; i < food.size(); i++) {
            // use .get instead of food[i]
            System.out.println(food.get(i));
        }

        food.clear();
        // use .size() instead of .length()
        for(int i = 0; i < food.size(); i++) {
            // use .get instead of food[i]
            System.out.println(food.get(i));
        }

    }
}
