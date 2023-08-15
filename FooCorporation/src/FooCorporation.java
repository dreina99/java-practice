public class FooCorporation {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee(7.5, 35.0);
        Employee emp2 = new Employee(8.2, 47.0);
        Employee emp3 = new Employee(7.5, 73.0);

        Employee[] emps = {emp1, emp2, emp3};

        for(int i = 0; i < emps.length; i++) {
            computePay(emps[i].pay, emps[i].hours);
        }
    }

    public static void computePay(double basePay, double hours) {
        if(hours > 60.0) {
            System.out.println("Error: Hours must be less than 60.");
            return;
        }

        boolean otFlag = false;
        double otPay = -1;
        double pay;

        if(hours <= 40.0) {
            pay = basePay * hours;
        } else {
            pay = basePay * 40;
            double otRate = basePay * 1.5;
            otPay = ((hours - 40) * otRate);
            pay += otPay;
            otFlag = true;
        }

        System.out.println("Total pay for this employee is: " + pay + ".");
        if(otFlag) {
            System.out.println("Total overtime is: " + (hours - 40) + ".");
            System.out.println("Total overtime pay is: " + otPay + ".");
        }

        System.out.println("\n");
    }
}
