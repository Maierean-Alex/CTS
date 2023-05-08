public class HDStreamingDecorator extends SubscriptionDecorator{
    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare in calitate HD.";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 3.0;
    }
}
