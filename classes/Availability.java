package libPcalJ.classes;

import java.util.Date;
import java.util.UUID;

/**
 * This class defines an Availability Pattern for a {@link User User}.
 */
public class Availability {
    /**
     * Simple constructor that associates the new Availability pattern with a {@link User User} and {@link Calendar Calendar}.
     * @param user
     * @param calendar
     */
    public Availability(User user, libPcalJ.classes.Calendar calendar){
        ID = UUID.randomUUID().toString();
        UserID = user.ID;
        CalendarID = calendar.ID;
    }

    public  final String ID;
    public final String UserID;
    public final String CalendarID;
    public String PatternName;
    public Date StartDate;
    public Date EndDate;

    public Timeblock[] Sunday;
    public Timeblock[] Monday;
    public Timeblock[] Tuesday;
    public Timeblock[] Wednesday;
    public Timeblock[] Thursday;
    public Timeblock[] Friday;
    public Timeblock[] Saturday;
}
