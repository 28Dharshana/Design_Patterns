import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Subscriber> subscribers;
    private String weatherInfo;

    public WeatherStation() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        if (subscriber == null) {
            System.err.println("Cannot subscribe null subscriber.");
            return;
        }
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setWeatherInfo(String weatherInfo) {
        this.weatherInfo = weatherInfo;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            try {
                subscriber.update(weatherInfo);
            } catch (Exception e) {
                System.err.println("Error notifying subscriber: " + e.getMessage());
            }
        }
    }
}
