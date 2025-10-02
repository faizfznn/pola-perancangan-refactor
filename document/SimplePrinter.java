package casev2.document;

public class SimplePrinter implements Printer {
    @Override
    public void print(Document d) {
        System.out.println("Printing document...");
    }
}