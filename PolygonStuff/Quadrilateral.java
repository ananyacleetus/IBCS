public class Quadrilateral extends Polygon {
    private String name;

    public Quadrilateral() {
        super(4);
        name = "Quadrilateral";
    }

    public void printProperties() {
        System.out.println("I am a " + name);
        super.printProperties();
    }
}