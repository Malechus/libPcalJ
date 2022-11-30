package libPcalJ.classes;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

/**
 * An object that tracks a task applied to any {@link Calendar calendar} and shared with the {@link User users} with access to that calendar.
 */
public class Task {
    /**
     * Simple constructor for the {@link Task Task} object. Creates {@link Task#ID ID} parameter and assigns the {@link Calendar calendar} and {@link User user} objects used to create the Task.
     * @param calendar
     * @param user
     */
    public Task(Calendar calendar, User user){
        ID = UUID.randomUUID().toString();
        CreatorID = user.ID;
        CalendarID = calendar.ID;
    }

    public final String ID;
    public final String CreatorID;
    public final String CalendarID;
    public String Name;
    public String ShortDescription;
    public Optional<String> LongDescription;
    public Optional<Date> DueDate;

    /**
     * Check for existence of a {@link Task#DueDate DueDate} property.
     * @return boolean
     */
    public boolean HasDueDate(){
        if(DueDate == null){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Check for existence of a {@link Task#LongDescription LongDescription} property.
     * @return boolean
     */
    public boolean HasLongDescription(){
        if(LongDescription == null){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Returns the {@link Task#Name Name} and {@link Task#ShortDescription Description} of a {@link Task Task}.
     * @return String
     */
    public String ToString(){
        String result = Name + " | " + ShortDescription;

        return result;
    }
}
