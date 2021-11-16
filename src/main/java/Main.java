public class Main {

    public static void main(String[] args) {

        Visitor v = new ElementVisitor();

        Document doc = new Document("Doc 1");
        doc.elements.add(new TextElement("Text 1"));
        doc.elements.add(new TextElement("Text 2"));
        doc.elements.add(new ImageElement("Image 1"));
        doc.elements.add(new ImageElement("Image 2"));

        doc.accept(v);

    }

}