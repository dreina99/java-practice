import java.util.*;

public class ArrayList2d {
    public static void main(String[] args) {
        // 2d ArrayList = a dynamic list of lists

        ArrayList<String> bakeryList = new ArrayList<String>();

        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();

        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<String>();

        drinkList.add("soda");
        drinkList.add("coffee");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(0));


    }
}
