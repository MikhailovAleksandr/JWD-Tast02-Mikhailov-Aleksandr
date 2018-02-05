package main.java.by.tc.task02.service;

import main.java.by.tc.task02.entity.RentUnit;
import main.java.by.tc.task02.entity.SportEquipment;

import java.util.List;

public interface RentService extends Service {

    void addRent(RentUnit rentUnit,List<SportEquipment> goods);

    RentUnit readFile();

    void writeInFile(RentUnit rentUnit);
}
