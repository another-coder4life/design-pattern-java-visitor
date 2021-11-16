public abstract class Element {

    private String name;

    public Element(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor v);

    public String getName() {
        return name;
    }

}
