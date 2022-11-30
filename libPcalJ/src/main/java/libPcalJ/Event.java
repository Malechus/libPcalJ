package libPcalJ;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * An object representing an appointment, meeting, or other event that can be added to any {@link Calendar Calendar}. Has a unique {@link Event#ID ID}.
 */
public class Event {
    /**
     * Simple constructor that defines the {@link User User} that created or is creating the Event.
     * @param user A {@link User User}
     */
    public Event(User user){
        ID = java.util.UUID.randomUUID().toString();
        CreatorID = user.ID;
    }

    public final String ID;
    public final String CreatorID;
    public LocalDateTime StartTime;
    public LocalDateTime EndTime;
    public Location Location;
    public boolean Virtual;
    public String Name;
    public Optional<String> Description; //Optional user defined information
    public Optional<String> Color; //Hexidecimal color ID

    /**
     * Returns true if the Event is to be held virtually (online.)
     * @return boolean
     */
    public boolean IsVirtual(){
        return Virtual;
    }

    /**
     * Returns the SHA-256 hash of the {@link User#ID UserID} of the {@link User User} that created the Event.
     * @return byte[]
     */
    public byte[] CreatorHash(){
        byte[] hash = null;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            hash = md.digest(CreatorID.getBytes());
            return hash;
        }
        catch(NoSuchAlgorithmException ex){
            return hash;
        }
    }
}
