public class App {
    public static void main(String[] args) throws Exception {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
            "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel",
            "Neda", "Aaron", "Kate"
        };

        double[] times = {
            341, 273, 278, 319, 445, 402, 388, 275, 243, 334, 412,
            393, 299, 343, 371, 265
        };

        double max = Double.POSITIVE_INFINITY;
        String fastest = "";

        for(int i = 0; i < times.length; i++) {
            if(times[i] < max) {
                fastest = names[i];
                max = times[i];
            }
        }

        System.out.println("The fastest runner was " + fastest + " with a time of " + (int)max + ".");

    }
}
