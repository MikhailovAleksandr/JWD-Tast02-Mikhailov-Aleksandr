package main.java.by.tc.task02.main;

import main.java.by.tc.task02.entity.RentUnit;
import main.java.by.tc.task02.entity.Shop;
import main.java.by.tc.task02.entity.SportEquipment;

import java.util.List;
import java.util.Map;

public class PrintInfo {

    private static final PrintInfo instance = new PrintInfo();

    public static PrintInfo getInstance(){
        return instance;
    }

    public void print (Shop shop){

        Map<SportEquipment,Integer> goods = shop.getGoods();

            for(Map.Entry<SportEquipment,Integer> unit: goods.entrySet()){

                String sportEquipmentData = SportEquipmentToString.makeString(unit.getKey())+", amount="+unit.getValue()+";";

                System.out.println(sportEquipmentData);
            }
    }

    public void print (RentUnit rentUnit){

        List<SportEquipment> units = rentUnit.getUnits();

            for(SportEquipment unit: units) {

                String sportEquipmentData = SportEquipmentToString.makeString(unit) + ";";
                System.out.println(sportEquipmentData);
            }
    }
}
