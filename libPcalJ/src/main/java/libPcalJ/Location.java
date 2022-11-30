package libPcalJ;

import java.util.Optional;

public class Location {
    public Location(String Name){
        LocationName = Name;
    }
    
    public Optional<String> Address;
    public Optional<String> Latitude;
    public Optional<String> Longitude;
    public String LocationName;

    public boolean HasAddress(){
        if(Address == null){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean HasLong(){
        if(Longitude == null){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean HasLat(){
        if(Latitude == null){
            return false;
        }
        else{
            return true;
        }
    }
}
