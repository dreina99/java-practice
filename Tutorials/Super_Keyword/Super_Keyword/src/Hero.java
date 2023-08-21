public class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        // calls constructor of parent class (Person)
        super(name, age);
        this.power = power;
    }

    public String toString() {
        // can use methods from super class in child class
        return super.toString() + this.power + "\n";
    }
}
