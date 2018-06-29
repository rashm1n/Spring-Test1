package rashmin.training.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int starrating;
    private String Town;
    private int phoneNum;

    private List<Contract> contracts =new ArrayList<Contract>();

    public Hotel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStarrating() {
        return starrating;
    }

    public void setStarrating(int starrating) {
        this.starrating = starrating;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
