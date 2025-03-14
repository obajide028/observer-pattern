package subject;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    public List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
       observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
      for(Observer observer : observers){
          observer.update(temperature, humidity, pressure);
      }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(); // Automatically notify observers when data changes
    }
}
