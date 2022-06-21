package localization;

import java.text.NumberFormat;
import java.util.Locale;

public class Example4NumberFormat {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double number = 123.4567;
        Locale locFR = Locale.forLanguageTag("de-Germany");

        NumberFormat numberFormat1 = NumberFormat.getInstance();
        System.out.println("Number in current locale:" + numberFormat1.format(number));

        NumberFormat numberFormat2 = NumberFormat.getInstance(locFR);
        System.out.println("Number in German locale:" + numberFormat2.format(number));
        System.out.println();
        NumberFormat numberFormat5 = NumberFormat.getPercentInstance();
        System.out.println("Percentage in current locale:" + numberFormat5.format(number));

        NumberFormat numberFormat6 = NumberFormat.getPercentInstance(locFR);
        System.out.println("Percentage in German locale: " + numberFormat6.format(number));
    }
}
