public class EmailSubscriber implements Subscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String weatherInfo) {
        System.out.println("Email to " + email + ": Weather update - " + weatherInfo);
    }
}
