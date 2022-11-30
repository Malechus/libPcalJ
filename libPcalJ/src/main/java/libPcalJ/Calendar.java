package libPcalJ;

import java.util.UUID;

/**
 * The Calendar Class is an object that represents a shared or private 
 * schedule that can be linked to {@link libPcalJ.Event Events}, {@link Availability Availabilities}, and belongs 
 * to a {@link User User}.
 */
public class Calendar {
    /**
     * Overload constructor defines the creating {@link User User} and the {@link #PrivacyLevel privacy} that should be assigned.
     * @param user A {@link User User}
     * @param privacy An int value between 1 and 3 representing the privacy level.
     */
    public Calendar(User user, int privacy){
        ID = UUID.randomUUID().toString();
        UserID = user.ID;
        PrivacyLevel = privacy;
    }

    /**
     * Simple constructor that defines the creating {@link User User}. The {@link #PrivacyLevel PrivacyLevel} will be defaulted to the most private.
     * @param user A {@link User User}
     */
    public Calendar(User user){
        ID = UUID.randomUUID().toString();
        UserID = user.ID;
        PrivacyLevel = 1;
    }

    public final String ID;
    public final String UserID;
    public String Name;
    public String Description;
    public int PrivacyLevel;    
}
