package main.java.by.tc.task02.main;

import main.java.by.tc.task02.entity.SportEquipment;

public class SportEquipmentToString {

    public static final String makeString(SportEquipment sportEquipment){

        String line;
        line = "Category="+sportEquipment.getCategory()+
                ", title="+sportEquipment.getTitle()+
                ", price="+sportEquipment.getPrice();
        return line;
    }
}
