package day4;

public class Question12 {

    private final double x;
    private final double y;

    // 🔹 Constant vectors (immutable)
    public static final Question12 ZERO = new Question12(0, 0);
    public static final Question12 UNIT_X = new Question12(1, 0);
    public static final Question12 UNIT_Y = new Question12(0, 1);

    // 🔹 Constructor
    public Question12(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 🔹 Static factory: create from polar coordinates
    public static Question12 fromPolar(double r, double theta) {
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);
        return new Question12(x, y);
    }

    // 🔹 Add vectors (returns a new vector)
    public Question12 add(Question12 other) {
        return new Question12(this.x + other.x, this.y + other.y);
    }

    // 🔹 Scale vector
    public Question12 scale(double s) {
        return new Question12(this.x * s, this.y * s);
    }

    // 🔹 Magnitude (length of vector)
    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    // 🔹 Getters (read-only)
    public double getX() { return x; }
    public double getY() { return y; }

    // 🔹 For printing easily
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {

        Question12 v = Question12.fromPolar(2, Math.PI / 2);
        System.out.println("Vector v from polar: " + v);

        Question12 w = Question12.UNIT_X.add(v);
        System.out.println("w = " + w);

        System.out.println("Magnitude of w: " + w.magnitude());
    }
}
