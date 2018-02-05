package main.java.by.tc.task02.service.impl.util;

import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.Category;
import main.java.by.tc.task02.entity.category.RentCategory;

import java.util.Map;

public class ShopAndCategoryComparator {

    private static final SportEquipmentComparator sportEquipmentComparator = SportEquipmentComparator.getInstance();

    private static final ShopAndCategoryComparator instance = new ShopAndCategoryComparator();

    public static ShopAndCategoryComparator getInstance() {
        return instance;
    }

    public boolean compare(SportEquipment sportEquipment, RentCategory rentCategory){

        int hitCounter = 0;

        boolean rezultOfCompare = false;

        Map<Category,String> rentCategoryData = rentCategory.getRentCategory();

        int amountOfCategory = rentCategoryData.size();

        for(Map.Entry<Category,String> rentCategoryUnit: rentCategoryData.entrySet()){

            rezultOfCompare = sportEquipmentComparator.compare(sportEquipment,rentCategoryUnit);
            if(rezultOfCompare){
                hitCounter ++;
            }
        }

        if(hitCounter == amountOfCategory){
            return true;
        }
        return false;
    }
}
