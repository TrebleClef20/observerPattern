public class NewsSubscriptionService {
    public static void main(String[] args) {
        NewsAgency trebNews = new NewsAgency();

        Subscriber trebiger = new Subscriber("Trebiger");
        Subscriber harah = new Subscriber("Harah");
        Subscriber calma = new Subscriber("Calma");
        
        trebNews.subscribe(trebiger);
        trebNews.subscribe(harah);
        trebNews.subscribe(calma);

        News bagongBalita = new News();
        bagongBalita.setMessage("NET25 Bazaar bukas na para sa lahat");

        trebNews.publishNews(bagongBalita);

        trebNews.unsubscribe(trebiger);
        trebNews.unsubscribe(harah);

        Subscriber juan = new Subscriber("Juan");
        trebNews.subscribe(juan);

        News bagongBalita_ulit = new News();
        bagongBalita_ulit.setMessage("INC Helps Community Members in New Jersey");

        trebNews.publishNews(bagongBalita);
    }
}