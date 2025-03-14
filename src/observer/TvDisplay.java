package observer;

import interfaces.Observer;

public class TvDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("Tv Display -> Temperature: " + temperature + "°C");
    }
}
