package localization;

import java.util.Locale;

public class Example1LocaleMethods {
    public static void main(String[] args) {

        Locale locale1 = new Locale("de", "CH");
        Locale.setDefault(Locale.US);// if I remove this line I can't get correct result

        System.out.println("Locale:               " + locale1);
        System.out.println("getDisplayName:       " + locale1.getDisplayName());
        System.out.println("getDisplayLanguage:   " + locale1.getDisplayLanguage());
        System.out.println("getLanguage:          " + locale1.getLanguage());
        System.out.println("getDisplayCountry:    " + locale1.getDisplayCountry());
        System.out.println("getCountry:           " + locale1.getCountry());
        System.out.println("hashCode :            " + locale1.hashCode());


        System.out.println();
        Locale loc = new Locale("de", "CH");
        System.out.println(loc.getDisplayName(Locale.GERMAN));
    }
}
