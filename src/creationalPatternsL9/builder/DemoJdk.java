package creationalPatternsL9.builder;

import java.util.Calendar;
import java.util.Locale;

public class DemoJdk {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Calendar calendar = new Calendar.Builder()
                .setCalendarType("iso8601")
                .setWeekDate(2021, 1, 1)
                .build();

        StringBuilder builder = new StringBuilder();
        builder.append("1");
        builder.append("2");
        builder.append("3");

        builder
                .append("4")
                .append("5")
                .append("6");


        System.out.println(builder.toString());
    }
}
