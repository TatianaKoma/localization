package localization;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Example1LocaleMethods {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        Locale[] numberFormatLocales = NumberFormat.getAvailableLocales();
        System.out.println(Arrays.toString(numberFormatLocales));
        System.out.println();

        Locale locale1 = new Locale("de", "CH");

        System.out.println("Locale:                                " + locale1);
        System.out.println("getDisplayName:                        " + locale1.getDisplayName(Locale.GERMAN));
        System.out.println("getDisplayName with Default Locale:    " + locale1.getDisplayName());
        System.out.println("getDisplayLanguage:                    " + locale1.getDisplayLanguage(Locale.GERMAN));
        System.out.println("getDisplayLanguage with Default Locale:" + locale1.getDisplayLanguage());
        System.out.println("getLanguage:                           " + locale1.getLanguage());
        System.out.println("getDisplayCountry:                     " + locale1.getDisplayCountry(Locale.GERMAN));
        System.out.println("getDisplayCountry with Default Locale::" + locale1.getDisplayCountry());
        System.out.println("getCountry:                            " + locale1.getCountry());
    }
}
