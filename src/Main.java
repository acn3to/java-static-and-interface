import currency.EurToThbConverter;
import currency.UsdToEurConverter;

public class Main {
    public static void main(String[] args) {
        UsdToEurConverter usdToEurConverter = new UsdToEurConverter();
        EurToThbConverter eurToThbConverter = new EurToThbConverter();

        double usdAmount = 1000;
        double convertedAmount = usdToEurConverter.convert(usdAmount, "USD", "EUR");
        System.out.println(usdAmount + " USD é igual a " + convertedAmount + " EUR.");

        double eurAmount = 500;
        convertedAmount = eurToThbConverter.convert(eurAmount, "EUR", "THB");
        System.out.println(eurAmount + " EUR é igual a " + convertedAmount + " THB.");
    }
}