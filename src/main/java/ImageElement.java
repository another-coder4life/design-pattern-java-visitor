public class ImageElement extends Element {

    public ImageElement(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
