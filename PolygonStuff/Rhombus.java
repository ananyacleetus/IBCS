public class Rhombus extends Parallelogram {
    private String name;

    public Rhombus() {
        super();
        name = "Rhombus";
    }
    public void printProperties() {
        super.printProperties();
        System.out.println("I am a " + name);
        System.out.println("I have congruent sides");
    }
}