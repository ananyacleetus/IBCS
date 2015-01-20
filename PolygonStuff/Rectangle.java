public class Rectangle extends Parallelogram {
    private String name;

    public Rectangle() {
        super();
        name = "Rectangle";
    }
    public void printProperties() {
        super.printProperties();
        System.out.println("I am a " + name);
        System.out.println("I have all 90 degree angles");
    }
}
