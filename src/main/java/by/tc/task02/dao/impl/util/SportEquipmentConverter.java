package main.java.by.tc.task02.dao.impl.util;

import main.java.by.tc.task02.entity.SportEquipment;

public class SportEquipmentConverter {

    public static final String makeString(SportEquipment sportEquipment){

        String line;
        line = "Category="+sportEquipment.getCategory()+
                ", title="+sportEquipment.getTitle()+
                ", price="+sportEquipment.getPrice();
        return line;
    }
}
