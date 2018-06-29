package rashmin.training.data;

import rashmin.training.model.Contract;
import rashmin.training.model.Hotel;
import rashmin.training.model.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataProvider {
    private List<Hotel> hotels = new ArrayList<Hotel>();

    public DataProvider() {
        init();
    }

    public List<Room> getRooms(String name){
        List<Contract> contracts = hotels.stream().filter(i->i.getName()==name).findFirst().get().getContracts();
        return contracts.stream().flatMap(i->i.getRooms().stream()).collect(Collectors.toList());
    }

    public void init(){
        Hotel h1 = new Hotel();
        Hotel h2 = new Hotel();


        Contract c1h1 = new Contract();
        Contract c2h1 = new Contract();

        Contract c1h2 = new Contract();
        Contract c2h2 = new Contract();


        c1h1.setContractID(0);
        c2h1.setContractID(1);
        c1h2.setContractID(2);
        c2h2.setContractID(3);


        c1h1.setFromTo("1/1","3/31");
        c2h1.setFromTo("2/1","5/31");
        c1h2.setFromTo("3/1","4/3");
        c2h2.setFromTo("4/1","7/31");


        Room r1 = new Room("lowh1",10000,3);
        Room r2 = new Room("midh1",20000,4);
        Room r3 = new Room("highh1",30000,6);
        Room r4 = new Room("lowh2",10000,2);
        Room r5 = new Room("midh2",20000,5);
        Room r6 = new Room("highh2",30000,7);

        List<Room> h1Rooms = new ArrayList<Room>(Arrays.asList(r1,r2,r3));
        List<Room> h2Rooms = new ArrayList<Room>(Arrays.asList(r4,r5,r6));

        c1h1.setRooms(h1Rooms);
        c1h2.setRooms(h2Rooms);

        List<Contract> contractsh1 = new ArrayList<Contract>(Arrays.asList(c1h1,c2h1));
        List<Contract> contractsh2 = new ArrayList<Contract>(Arrays.asList(c1h2,c2h2));

        h1.setContracts(contractsh1);
        h2.setContracts(contractsh2);

    }
}


