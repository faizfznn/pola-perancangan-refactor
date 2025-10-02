package casev2.document;

public class Document {
    private String content;
    private String title;
    
    public Document() {
        this.title = "Default Document";
        this.content = "Default content";
    }
    
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        return "Document{title='" + title + "', content='" + content + "'}";
    }
}