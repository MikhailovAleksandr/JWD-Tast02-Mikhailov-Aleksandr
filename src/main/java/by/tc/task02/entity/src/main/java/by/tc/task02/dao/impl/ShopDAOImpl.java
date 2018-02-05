package main.java.by.tc.task02.dao.impl;

import main.java.by.tc.task02.dao.ShopDAO;
import main.java.by.tc.task02.service.impl.util.ShopAndCategoryComparator;
import main.java.by.tc.task02.dao.impl.util.ShopDataParser;
import main.java.by.tc.task02.dao.impl.util.SportEquipmentConverter;
import main.java.by.tc.task02.dao.impl.util.SportEquipmentPath;
import main.java.by.tc.task02.entity.Shop;
import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.RentCategory;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShopDAOImpl implements ShopDAO {

    private static final String sourceNameOfShop;



    static{
        SportEquipmentPath instance = SportEquipmentPath.getInstance();
        sourceNameOfShop = instance.getPath("shop");
    }

    @Override
    public Shop readFile() {

        String shopData;

        Shop shop = new Shop();

        BufferedReader reader = null;

        try {

            reader = new BufferedReader(new FileReader(sourceNameOfShop));

            while((shopData = reader.readLine()) != null){

                if(!shopData.isEmpty()) {
                    shop.add(ShopDataParser.parse(shopData));
                }
            }
            reader.close();

        }catch (java.io.IOException e) {
            e.getMessage();
        }
        return shop;
    }

    @Override
    public void writeInFile(Shop shop) {

        BufferedWriter writer = null;

        Map<SportEquipment,Integer> goods = shop.getGoods();

        try {
            writer = new BufferedWriter(new FileWriter(sourceNameOfShop,false));
            for(Map.Entry<SportEquipment,Integer> unit: goods.entrySet()){

                String sportEquipmentData = SportEquipmentConverter.makeString(unit.getKey())+", amount="+unit.getValue()+";\n";

                writer.write(sportEquipmentData);
            }

            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }



    }



}
