package main.java.by.tc.task02.entity;

import java.util.ArrayList;
import java.util.List;

public class RentUnit {

    private List<SportEquipment> units = new ArrayList<>();

    public List<SportEquipment> getUnits() {
        return units;
    }

    public void add(SportEquipment sportEquipment){
        this.units.add(sportEquipment);
    }

    public void setUnits(List<SportEquipment> units) {
        this.units = units;
    }
}
