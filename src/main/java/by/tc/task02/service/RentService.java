package main.java.by.tc.task02.service;

import main.java.by.tc.task02.entity.RentUnit;
import main.java.by.tc.task02.entity.SportEquipment;

import java.io.IOException;
import java.util.List;

public interface RentService extends Service {

    void addRent(RentUnit rentUnit,List<SportEquipment> goods);

    RentUnit readFile() throws IOException;

    void writeInFile(RentUnit rentUnit) throws IOException;
}
