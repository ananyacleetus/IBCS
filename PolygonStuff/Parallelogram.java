public class Parallelogram extends Quadrilateral {
    private String name;

    public Parallelogram() {
        super();
        name = "Parallelogram";
    }
    public void printProperties() {
        super.printProperties();
        System.out.println("I am a " + name);
        System.out.println("I have parallel sides");
    }


}