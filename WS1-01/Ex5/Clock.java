/**
 * A minute has 60 seconds, that is, the proportion of seconds divided by 60.0
 * will give the corresponding minutes. Likewise an hour has 60 minutes, that
 * is, the minutes divided by 60.0 gives parts of an hour.
 * 
 * Hours may be given as integers in more than 12, hence we take the remainder
 * after division by 12. This makes sense only for an integer, hence must be
 * done before we update the hours.
 * 
 * In 360 degrees go 12 hours, that is, 30 degrees per hour for the hours hand.
 * In 360 degrees go 60 minutes, that is, 6 degrees per minute for the minute
 * hand.
 * 
 * The angle computed is the hours hand minus the minute hand, rounded. Since
 * this may have any integer value between -360 and +360, we add 360 and take
 * the remainder by division by 360 as result.
 * 
 * @author Manfred Kerber, Joseph Gardiner
 * @version 2015-09-29 last changed: 2016-10-07
 */
public class Clock {

    /**
     * Computes the angle between the given hour and minute values
     * 
     * @param hours   The hours of the given time.
     * @param minutes The minutes of the given time.
     * @return angle between the hour and minute value
     */
    public static int angle(int hours, int minutes) {
        hours = hours % 12;

        double minuteHandAngle = 6 * minutes;
        // Ensures the angle takes into account the movement of the hour hand
        double hourHandAngle = 30 * (hours + (minutes / 60.0));
        return (int) (Math.round(hourHandAngle - minuteHandAngle + 360) % 360);

    }

    /**
     * Returns a string with the hour, minutes, and the angle between the given hour and minute values
     * 
     * @param hours   The hours of the given time.
     * @param minutes The minutes of the given time.
     * @return Returns a string with the hour, minutes, and the angle between the given hour and minute values.
     */
    public static String printAngle(int hours, int minutes) {
        return "At " + hours + " hours and " + minutes
            + " minutes, the angle between is " + angle(hours, minutes)
            + " degrees";
    }

    public static void main(String[] args) {

        System.out.println(printAngle(9,0));
        System.out.println(printAngle(3,0));
        System.out.println(printAngle(18,0));
        System.out.println(printAngle(1,0));
        System.out.println(printAngle(2,30));
        System.out.println(printAngle(4,41));
    }
}
