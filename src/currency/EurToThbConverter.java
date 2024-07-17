package currency;

public class EurToThbConverter implements CurrencyConverter {
    private static final double EUR_TO_THB_RATE = 40.00;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!fromCurrency.equals("EUR") || !toCurrency.equals("THB")) {
            throw new IllegalArgumentException("Conversão inválida. Esta classe só suporta EUR para THB.");
        }
        return amount * EUR_TO_THB_RATE;
    }
}
