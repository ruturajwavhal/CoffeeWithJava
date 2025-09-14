package interfaces.weathersensor;

/**
 * class implementing WeatherSensor Interface
 */

public class DigitalSensor implements WeatherSensor{
    //showing temperature in digital sensor
    @Override
    public void getTemperature() {
        System.out.println("Temperature in digital sensor");
    }
    //showing humidity in digital sensor
    @Override
    public void getHumidity() {
        System.out.println("Humidity in digital sensor");
    }
}
