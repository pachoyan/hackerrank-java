//Java Date and Time - Challenge

package introduction;


import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDayOfWeek(Integer.valueOf(year), Integer.valueOf(month) , Integer.valueOf(day)));
    }

    private static String getDayOfWeek(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.valueOf(year), Integer.valueOf(month) - 1, Integer.valueOf(day), 0, 0);
        calendar.getDisplayName(calendar.get(calendar.DAY_OF_WEEK), Calendar.LONG, Locale.ENGLISH);
        return WeekDays.valueOf(calendar.get(calendar.DAY_OF_WEEK)).name();
    }


    enum WeekDays {

        SUNDAY(Calendar.SUNDAY),
        MONDAY(Calendar.MONDAY),
        TUESDAY(Calendar.TUESDAY),
        WEDNESDAY(Calendar.WEDNESDAY),
        THURSDAY(Calendar.THURSDAY),
        FRIDAY(Calendar.FRIDAY),
        SATURDAY(Calendar.SATURDAY);

        private int day;

        WeekDays(int day) {
            this.day = day;
        }

        public static WeekDays valueOf(int day){
            for(int i =0; i < WeekDays.values().length; i++) {
                if (WeekDays.values()[i].day == day) {
                    return WeekDays.values()[i];
                }
            }
            return SUNDAY;
        }
    }

}
