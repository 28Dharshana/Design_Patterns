public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Subscriber phoneUser = new PhoneSubscriber("Dharshana");
        Subscriber emailUser = new EmailSubscriber("dharshana@example.com");

        station.subscribe(phoneUser);
        station.subscribe(emailUser);

        station.setWeatherInfo("Sunny, 32°C");
        station.setWeatherInfo("Rainy, 25°C");

        station.unsubscribe(phoneUser);

        station.setWeatherInfo("Cloudy, 28°C");
    }
}
