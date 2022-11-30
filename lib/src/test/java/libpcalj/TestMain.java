package libPcalJ.testing;

import libPcalJ.Location;
import libPcalJ.User;
import libPcalJ.Calendar;
import libPcalJ.Availability;
import libPcalJ.Event;
import libPcalJ.Task;
import libPcalJ.Timeblock;

public class TestMain{
    public void Main(String[] args){
        Location loc = new Location("TestLoc");
        User usr = new User();
        Calendar cal = new Calendar(usr);
        Availability av = new Availability(usr, cal);
        Task tsk = new Task(cal, usr);
        Timeblock tb = new Timeblock();
        Event event = new Event(usr);
    }
}
