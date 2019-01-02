import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.io.*;

public class DateAndTime {
    /**Write a java program to calculate first and last date of a week.
     Output:
     First Date of Week:             Mon 24/07/2017
     Last date of the week:          Sun 30/07/2017**/
        private Integer hours;
        private Integer seconds;
        private Integer minutes;
        private void  getTime(int hour,int minutes,int seconds)
        {
            hours=((hour>0 &&hour<24)? hour:0);
            this.minutes=((minutes>0&&minutes<60) ? minutes:0);
            this.seconds=((seconds>0&&seconds<60)?seconds:0);

        }
        public String toMilitary()
        {
            return(String.format("%02d:%02d:%02d",hours,minutes,seconds));
        }
        Calendar c= GregorianCalendar.getInstance();

        System.out.println("Current Week"+Calendar.DAY_);
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        System.out.println("Day Of week"+Calendar.DAY_OF_WEEK);
        DateFormat df=new SimpleDateFormat("yyyy-mm-dd", Locale.getDefault());
        String startDate="",endDate="";
        startDate=

}






