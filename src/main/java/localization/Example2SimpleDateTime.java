package localization;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Example2SimpleDateTime {
    public static void main(String[] args) {
        String pattern = "MMMM dd, yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.CHINA);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
        System.out.println();

        String pattern1 = " HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1, Locale.CHINA);
        String date1 = simpleDateFormat1.format(new Date());
        System.out.println(date1);

    }
}
