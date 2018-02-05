package main.java.by.tc.task02.dao.impl.util;

import main.java.by.tc.task02.entity.SportEquipment;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RentDataParser {

    private static final Pattern pattern;

    static{
        pattern = Pattern.compile("\\S+[=](\\w+\\W\\w+|\\w+)");
    }

    public static SportEquipment parse(String rentUnitData){

        String dataPart;

        List<String> unitData = new ArrayList<>();

        Matcher matcher = pattern.matcher(rentUnitData);

        while(matcher.find()){
            dataPart = matcher.group();
            unitData.add(dataPart.split("[=]")[1]);
        }

        SportEquipment rentUnit = SportEquipmentCreator.create(unitData);

        return rentUnit;
    }
}
