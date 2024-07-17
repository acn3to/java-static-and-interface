package currency;

public class UsdToEurConverter implements CurrencyConverter {
    private static final double USD_TO_EUR_RATE = 0.85;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!fromCurrency.equals("USD") || !toCurrency.equals("EUR")) {
            throw new IllegalArgumentException("Conversão inválida. Esta classe só suporta USD para EUR.");
        }
        return amount * USD_TO_EUR_RATE;
    }
}
