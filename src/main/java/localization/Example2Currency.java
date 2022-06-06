package localization;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Example2Currency {
    public static void main(String[] args) {

        Locale loc = new Locale ("en", "IN");// Only for $ it is correct - (en US)
        NumberFormat currFmt;
        currFmt = NumberFormat.getCurrencyInstance (loc);
        double amt = 123456.78;
        System.out.println (currFmt.format (amt));
        System.out.println();

        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
        System.out.println();

        String pattern1 = " HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
        String date1 = simpleDateFormat1.format(new Date());
        System.out.println(date1);

    }
}
