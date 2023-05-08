public class OfflineViewingDecorator extends SubscriptionDecorator{
    public OfflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription(){
        return subscription.getDescription() + ", vizionare offline.";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 5.0;
    }
}
