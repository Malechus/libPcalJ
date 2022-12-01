package libpcalj;

import libpcalj.Availability;
import libpcalj.Calendar;
import libpcalj.Event;
import libpcalj.Location;
import libpcalj.Task;
import libpcalj.Timeblock;
import libpcalj.User;

public class TestMain{
    public void Main(String[] args){
        Location loc = new Location("TestLoc");
        User usr = new User();
        Calendar cal = new Calendar(usr);
        Availability av = new Availability(usr, cal);
        Task tsk = new Task(cal, usr);
        Timeblock tb = new Timeblock();
        Event event = new Event(usr);

        if(Test(loc, usr, cal, av, tsk, tb, event)){
            System.out.println("Success!");
        }
        else{
            System.out.println("There was a problem.");
        }
    }

    public boolean Test(Location loc, User usr, Calendar cal, Availability av, Task tsk, Timeblock tb, Event event){
        if(loc != null && usr != null && cal != null && av != null && tsk != null && tb != null && event != null){
            return true;
        }
        else{
            return false;
        }
    }
}
