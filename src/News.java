public class News {
    private String category;
    private String message;

    public News() {
        this.category = "General";
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "category: " + category + "\nmessage: " + message;
    }    
}
