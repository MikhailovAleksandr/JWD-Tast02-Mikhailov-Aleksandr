package main.java.by.tc.task02.service.impl.util;

import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.Category;

import java.util.Map;

public class SportEquipmentComparator {

    private static final SportEquipmentComparator instance = new SportEquipmentComparator();

    public static SportEquipmentComparator getInstance(){
        return instance;
    }

    public boolean compare(SportEquipment sportEquipment, Map.Entry<Category,String> rentCategoryUnit){

        Category sportEquipmentCategory = sportEquipment.getCategory();
        String sportEquipmentTitle = sportEquipment.getTitle();

        Category rentCategoryUnitCategory = rentCategoryUnit.getKey();
        String rentCategoryUnitTitle = rentCategoryUnit.getValue();

        if(sportEquipmentCategory.equals(rentCategoryUnitCategory) && sportEquipmentTitle.equals(rentCategoryUnitTitle)){
            return true;
        }

        return false;
    }
}
