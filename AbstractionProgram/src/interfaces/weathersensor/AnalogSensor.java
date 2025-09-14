package interfaces.weathersensor;
/**
 * class implements WeatherSensor interface
 */

public class AnalogSensor implements WeatherSensor{
    //showing temperature in analog sensor
    @Override
    public void getTemperature() {
        System.out.println("Temperature in analog sensor");
    }
    //showing humidity in analog sensor
    @Override
    public void getHumidity() {
        System.out.println("Humidity in analog sensor");
    }
}
