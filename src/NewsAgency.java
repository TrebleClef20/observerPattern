import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements AgencySubject {

    private News latestNews;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public void publishNews(News news) {
        System.out.println("""
                            =============
                            News Flash!!!
                            =============
                            """);
        System.out.println("TrebAgency Published:\n" + news.getMessage());
        System.out.println();

        this.setLatestNews(news);
        this.notifySubscribers();
    }

    @Override
    public void subscribe(Subscriber s) {
        subscriberList.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscriberList.remove(s);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.updateNews(this);
            System.out.println();
        }
    }

    public News getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(News latestNews) {
        this.latestNews = latestNews;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

}
