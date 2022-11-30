package libPcalJ;

import java.util.Optional;
import java.util.UUID;

public class User{
    public User(){
        ID = UUID.randomUUID().toString();
    }

    public final String ID;
    public String FirstName;
    public String LastName;
    public String UserName;
    public byte[] PasswordHash;
    public String Salt;
    public Optional<String> FetlifeID;
    public Optional<String> FacebookID;
    public Optional<String> TwitterID;
    public Optional<Location> Location;

    public boolean HasLocation(){
        if(Location == null){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean HasFetLife(){
        if(FetlifeID == null){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean HasFacebook(){
        if(FacebookID == null){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean HasTwitter(){
        if(TwitterID == null){
            return false;
        }
        else{
            return true;
        }
    }
}