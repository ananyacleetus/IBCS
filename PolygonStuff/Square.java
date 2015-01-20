public class Square extends Rectangle {
    private String name;

    public Square() {
        super();
        name = "Square";
    }
    public void printProperties() {
        super.printProperties();
        System.out.println("I am a " + name);
        System.out.println("I have all congruent sides");
    }
}
