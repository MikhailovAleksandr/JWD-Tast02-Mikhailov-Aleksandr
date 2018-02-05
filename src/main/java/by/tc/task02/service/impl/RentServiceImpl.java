package main.java.by.tc.task02.service.impl;

import main.java.by.tc.task02.dao.DAOFactory;
import main.java.by.tc.task02.dao.RentDAO;
import main.java.by.tc.task02.dao.ShopDAO;
import main.java.by.tc.task02.entity.RentUnit;
import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.service.RentService;

import java.io.IOException;
import java.util.List;

public class RentServiceImpl implements RentService {

    private final DAOFactory factory = DAOFactory.getInstance();

    private final RentDAO rentDAO = (RentDAO) factory.getDAO("Rent");


    public void addRent(RentUnit rentUnit, List<SportEquipment> goods){

        for(SportEquipment unit: goods){
            rentUnit.add(unit);
        }
    }

    public RentUnit readFile() throws IOException {

        RentUnit rentUnit;

        rentUnit = rentDAO.readFile();

        return rentUnit;
    }

    public void writeInFile(RentUnit rentUnit) throws IOException{

        rentDAO.writeInFile(rentUnit);
    }
}
