package main.java.by.tc.task02.dao.impl.util;

import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.Category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShopDataParser {

    private static final Pattern pattern;

    static{
        pattern = Pattern.compile("\\S+[=](\\w+\\W\\w+|\\w+)");
    }

    public static Map<SportEquipment,Integer> parse(String shopData){

        Category category;

        String title;

        int price;

        int amount;

        String dataPart;

        List<String> unitData = new ArrayList<>();

        Map<SportEquipment,Integer> shopUnit = new HashMap<>();

        Matcher matcher = pattern.matcher(shopData);

        while(matcher.find()){
            dataPart = matcher.group();
            unitData.add(dataPart.split("[=]")[1]);
        }

        category = Category.valueOf(unitData.get(0).toUpperCase());

        title = unitData.get(1);

        price = Integer.parseInt(unitData.get(2));

        amount = Integer.parseInt(unitData.get(3));

        SportEquipment unit = new SportEquipment(category, title, price);

        shopUnit.put(unit, amount);

        return shopUnit;
    }
}