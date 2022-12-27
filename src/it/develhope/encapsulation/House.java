package it.develhope.encapsulation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class House {

    public int floorsNumber;
    public String address;
    public String[] residentNames;

    public int getFloorsNumber() {
        return floorsNumber;
    }
    public String getAddress() {
        return address;
    }
    public String[] getResidentNames() {
        return residentNames;
    }
}

