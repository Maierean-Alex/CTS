abstract class SubscriptionDecorator implements Subscription {

    protected Subscription subscription;

    public SubscriptionDecorator(Subscription subscription){
        this.subscription = subscription;
    }

    @Override
    public String getDescription(){
        return subscription.getDescription();
    }

    @Override
    public double getPrice(){
        return subscription.getPrice();
    }

}
