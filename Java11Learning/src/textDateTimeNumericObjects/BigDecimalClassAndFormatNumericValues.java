package textDateTimeNumericObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalClassAndFormatNumericValues {
	public static void main(String[] args) {
		double price = 1.85;
		double rate = 0.065;
		price -= price * rate;
		System.out.println(price);
		price = Math.round(price * 100) / 100.0; // to round the double
		System.out.println(price); // 1.73

		// BigDecimal
		BigDecimal priceBig = BigDecimal.valueOf(1.85);
		BigDecimal rateBig = BigDecimal.valueOf(0.065);
		priceBig = priceBig.subtract(priceBig.multiply(rateBig)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(priceBig); // 1.73 same as above

		// Number formatting
		Locale locale = Locale.FRANCE;
		System.out.println(locale); // fr_FR
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
		percentFormat.setMaximumFractionDigits(2);
		System.out.println(currencyFormat.format(priceBig)); // 1,73 €
		System.out.println(percentFormat.format(rateBig)); // 6,5 %
		locale = Locale.UK; // set the locale back to UK
		currencyFormat = NumberFormat.getCurrencyInstance(locale);
		percentFormat = NumberFormat.getPercentInstance(locale);
		percentFormat.setMaximumFractionDigits(2);
		System.out.println(currencyFormat.format(priceBig)); // £1.73
		System.out.println(percentFormat.format(rateBig)); // 6.5%
	}
}
