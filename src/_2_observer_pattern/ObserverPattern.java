package _2_observer_pattern;

import java.util.ArrayList;
import java.util.List;

interface Observable{
    void add(Observer obj);
    void remove(Observer obj);
    void notifyObserver();
}

interface Observer{
    void update(float temperature, float humidity);
}


class WeatherStation implements Observable{
    private float temperature, humidity;
    private final List<Observer> observerList;

    WeatherStation(){
        observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.update(temperature, humidity);
        }
    }

    public void setWeather(float temp, float humidity){
        this.temperature = temp;
        this.humidity = humidity;
        notifyObserver();
    }
}

class MobileDisplay implements Observer{
    private float temperature, humidity;
    Observable observable;

    MobileDisplay(Observable obj){
        this.observable = obj;
        observable.add(this);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Weather Updates on Mobile: \n Temperature: " +temperature +"\n Humidity: "+humidity);
    }
}
class TabDisplay implements Observer{
    private float temperature, humidity;
    Observable observable;

    TabDisplay(Observable obj){
        observable = obj;
        observable.add(this);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Weather Updates on Tab: \n Temperature: " +temperature +"\n Humidity: "+humidity);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        MobileDisplay mobileDisplay = new MobileDisplay(weatherStation);
        TabDisplay tabDisplay = new TabDisplay(weatherStation);
        weatherStation.setWeather(17.0f, 30.0f);
        weatherStation.setWeather(18.0f, 29.0f);
        weatherStation.remove(mobileDisplay);
        weatherStation.setWeather(19.0f, 32.0f);
        weatherStation.remove(tabDisplay);
        weatherStation.setWeather(19.0f, 32.0f);
    }
}
