import converter.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        double celsius = 15;
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C é igual a " + fahrenheit + "°F");

        double convertedBack = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F é igual a " + convertedBack + "°C");
    }
}