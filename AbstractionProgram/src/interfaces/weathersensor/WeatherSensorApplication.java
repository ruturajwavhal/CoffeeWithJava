package interfaces.weathersensor;

public class WeatherSensorApplication {
    public static void main(String[] args) {
        //Instance of Digital sensor class
        DigitalSensor ds = new DigitalSensor();
        ds.getHumidity();
        ds.getTemperature();

        //line for better understanding
        System.out.println("-------------------");

        //Instance of Analog sensor
        WeatherSensor as = new AnalogSensor();
        as.getHumidity();
        as.getTemperature();
    }
}
