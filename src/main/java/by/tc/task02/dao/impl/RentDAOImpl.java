package main.java.by.tc.task02.dao.impl;

import main.java.by.tc.task02.dao.RentDAO;
import main.java.by.tc.task02.dao.impl.util.RentDataParser;
import main.java.by.tc.task02.dao.impl.util.SportEquipmentConverter;
import main.java.by.tc.task02.dao.impl.util.SportEquipmentPath;
import main.java.by.tc.task02.entity.RentUnit;
import main.java.by.tc.task02.entity.SportEquipment;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class RentDAOImpl implements RentDAO {

    private static final String sourceNameOfRent;

    static{
        SportEquipmentPath instance = SportEquipmentPath.getInstance();
        sourceNameOfRent = instance.getPath("rent");
    }

    @Override
    public RentUnit readFile() throws IOException {

        String rentUnitData;

        RentUnit rentUnit = new RentUnit();

        BufferedReader reader = null;

        try {

            reader = new BufferedReader(new FileReader(sourceNameOfRent));

            while((rentUnitData = reader.readLine()) != null){

                if(!rentUnitData.isEmpty()) {
                    rentUnit.add(RentDataParser.parse(rentUnitData));
                }
            }
            reader.close();

        }catch (java.io.IOException e) {
            e.getMessage();
            throw e;
        }
        return rentUnit;
    }




    @Override
    public void writeInFile(RentUnit rentUnit) throws IOException {

        BufferedWriter writer = null;

        List<SportEquipment> units = rentUnit.getUnits();

        try {

            writer = new BufferedWriter(new FileWriter(sourceNameOfRent,false));

            for(SportEquipment unit: units){

                String sportEquipmentData = SportEquipmentConverter.makeString(unit)+";\n";

                writer.write(sportEquipmentData);
            }

            writer.close();

        } catch (IOException e) {
            e.getMessage();
            throw e;
        }

    }
}
