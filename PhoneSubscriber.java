public class PhoneSubscriber implements Subscriber {
    private String name;

    public PhoneSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String weatherInfo) {
        System.out.println("Phone Alert to " + name + ": Weather update - " + weatherInfo);
    }
}
