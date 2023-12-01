import java.util.ArrayList;
import java.util.List;

public class Subscriber implements SubscriberObserver {
    private String subscriberName;
    private List<String> categoryPreference = new ArrayList<>();
    
    public Subscriber(String name){
        this.subscriberName = name;
        categoryPreference.add("General");
    }

    @Override
    public void updateNews(NewsAgency na) {
        String latestNewsCategory = na.getLatestNews().getCategory();
        if (categoryPreference.contains(latestNewsCategory))
        {
            System.out.println("Subscriber: " + subscriberName);
            System.out.println("Updated news from the agency:");
            System.out.println(na.getLatestNews());
        }
    }

    public void addCategory(String category) {
        categoryPreference.add(category);
    }

    public void removeCategory(String category) {
        categoryPreference.remove(category);
    }
}
