public class ArrayEx {
    public static void main(String[] args) {

        // Array must be the same data type
        /*String[] cars = {"Camaro", "Corvette", "Tesla"};

        cars[0] = "Honda";

        //System.out.println(cars[2]);

        // alternate way to create an array
        // creates an array of strings of length 3
        String[] carss = new String[3];

        for(int i = 0; i < carss.length; i++) {
            carss[i] = cars[i];
            System.out.println(carss[i]);
        }*/


        // 2D array
        String[][] cars = new String[3][3];

        cars[0][0] = "Honda";
        cars[0][1] = "Toyota";
        cars[0][2] = "Nissan";

        cars[1][0] = "Chevy";
        cars[1][1] = "Ford";
        cars[1][2] = "GMC";

        cars[2][0] = "Mercedes";
        cars[2][1] = "BMW";
        cars[2][2] = "Audi";

        for(int i = 0; i < cars.length; i++) {
            for(int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

    }
}
