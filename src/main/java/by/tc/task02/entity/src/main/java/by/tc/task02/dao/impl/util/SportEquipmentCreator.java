package main.java.by.tc.task02.dao.impl.util;

import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.Category;

import java.util.List;

public class SportEquipmentCreator {

    public static SportEquipment create (List<String> unitData){

        Category category = Category.valueOf(unitData.get(0).toUpperCase());

        String title = unitData.get(1);

        int price = Integer.parseInt(unitData.get(2));

        SportEquipment unit = new SportEquipment(category, title, price);

        return unit;
    }
}
