package rashmin.training.model;

import java.util.ArrayList;
import java.util.List;

public class Contract {
    private String from;
    private  String to;
    private int contractID;

    private List<Room> rooms = new ArrayList<Room>();

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setFromTo(String s1 , String s2){
        this.from=s1;
        this.to=s2;
    }

    public String getFromTo(){
        return this.from+" "+this.to;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public Contract() {
    }

}
