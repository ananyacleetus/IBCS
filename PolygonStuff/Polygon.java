public class Polygon {
    private int num_sides;

    public Polygon(int n, String s) {
        num_sides = n;
        name = s;
    }

    public int getNumSides() {
        return num_sides;
    }

    public void printProperties() {
        System.out.println("I have " + num_sides + " sides.");
    }
}