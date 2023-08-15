public class GravityCalculator {
    public static void main(String[] args) throws Exception {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = computePosition(gravity, fallingTime, initialVelocity, initialPosition);
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    }

    public static double computePosition(double a, double t, double vi, double xi) {
            return 0.5 * a * Math.pow(t, 2) + vi * t + xi;
    }
}
