package casev2.document;

public class SimplePrinter implements Printer {
    
    @Override
    public void print(Document document) {
        System.out.println("SimplePrinter: Printing document - " + document.getTitle());
        System.out.println("Content: " + document.getContent());
    }
}