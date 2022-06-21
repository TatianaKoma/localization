package localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Example3TimeDateStyles {
    public static void main(String[] args) {

        System.out.println("Time style :");
        showTimeStyles(new Locale("en", "US"));
        showTimeStyles(new Locale("de", "DE"));
        System.out.println("---------");

        System.out.println("\nDate styles: ");
        showDateStyles(new Locale("en", "US"));
        showDateStyles(new Locale("fr", "FR"));
        System.out.println("---------");

        System.out.println("\nTime and date styles: ");
        showBothStyles(new Locale("en", "US"));
        showBothStyles(new Locale("fr", "FR"));
    }

    static public void showTimeStyles(Locale currentLocale) {

        Date today = new Date();
        String result;
        DateFormat formatter;

        int[] styles = {DateFormat.DEFAULT, DateFormat.SHORT, DateFormat.MEDIUM,
                DateFormat.LONG, DateFormat.FULL};

        System.out.println();
        System.out.println("Locale: " + currentLocale.toString());
        System.out.println();

        for (int style : styles) {
            formatter = DateFormat.getTimeInstance(style, currentLocale);
            result = formatter.format(today);
            System.out.println(result);
        }
    }

    static public void showDateStyles(Locale currentLocale) {

        Date today = new Date();
        String result;
        DateFormat formatter;

        int[] styles = {DateFormat.DEFAULT, DateFormat.SHORT, DateFormat.MEDIUM,
                DateFormat.LONG, DateFormat.FULL};

        System.out.println();
        System.out.println("Locale: " + currentLocale.toString());
        System.out.println();

        for (int style : styles) {
            formatter = DateFormat.getDateInstance(style, currentLocale);
            result = formatter.format(today);
            System.out.println(result);
        }
    }

    static public void showBothStyles(Locale currentLocale) {

        Date today;
        String result;
        DateFormat formatter;

        int[] styles = {DateFormat.DEFAULT, DateFormat.SHORT, DateFormat.MEDIUM,
                DateFormat.LONG, DateFormat.FULL};

        System.out.println();
        System.out.println("Locale: " + currentLocale.toString());
        System.out.println();

        today = new Date();

        for (int style : styles) {
            formatter = DateFormat.getDateTimeInstance(style, style,
                    currentLocale);
            result = formatter.format(today);
            System.out.println(result);
        }
    }
}
