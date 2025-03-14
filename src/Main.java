import interfaces.Observer;
import observer.PhoneDisplay;
import observer.TvDisplay;
import subject.WeatherStation;

public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TvDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);

        weatherStation.setMeasurements(25.5f, 60f, 1013f);
        weatherStation.setMeasurements(27.0f, 55f, 1012f);
    }
}