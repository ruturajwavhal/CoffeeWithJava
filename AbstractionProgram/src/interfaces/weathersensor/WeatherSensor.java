package interfaces.weathersensor;

/**
 * Creating Weather sensor interface for getting temperature and humidity
 */
public interface WeatherSensor {
    //abstract methods are defined
    void getTemperature();
    void getHumidity();
}
