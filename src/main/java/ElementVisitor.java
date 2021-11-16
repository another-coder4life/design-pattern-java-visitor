public class ElementVisitor implements Visitor {

    @Override
    public void visit(ImageElement img) {
        System.out.println("ImageElement: " + img.getName());
    }

    @Override
    public void visit(TextElement txt) {
        System.out.println("TextElement: " + txt.getName());
    }
}
