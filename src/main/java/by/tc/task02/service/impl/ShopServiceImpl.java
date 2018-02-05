package main.java.by.tc.task02.service.impl;

import main.java.by.tc.task02.dao.DAOFactory;
import main.java.by.tc.task02.dao.ShopDAO;
import main.java.by.tc.task02.entity.Shop;
import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.RentCategory;
import main.java.by.tc.task02.service.ShopService;
import main.java.by.tc.task02.service.impl.util.ShopAndCategoryComparator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ShopServiceImpl implements ShopService {

    private final DAOFactory factory = DAOFactory.getInstance();

    private final ShopDAO shopDAO = (ShopDAO) factory.getDAO("Shop");

    private static final ShopAndCategoryComparator shopAndCategoryComparator = ShopAndCategoryComparator.getInstance();

    public List<SportEquipment> rent(Shop shop, RentCategory rentCategory){

        int amountOfUnits;

        boolean rezultOfComparre = false;

        Map<SportEquipment,Integer> goods = shop.getGoods();

        List<SportEquipment> units = new ArrayList<>();

        for(Map.Entry<SportEquipment,Integer> good: goods.entrySet()){

            amountOfUnits = good.getValue();

            rezultOfComparre = shopAndCategoryComparator.compare(good.getKey(),rentCategory);

            if(rezultOfComparre && amountOfUnits>0){
                good.setValue(good.getValue()-1);
                units.add(good.getKey());
            }
        }
        return units;
    }


    public Shop readFile() throws IOException{

        Shop shop = shopDAO.readFile();
        return shop;
    }

    public void writeInFile(Shop shop) throws IOException{

        shopDAO.writeInFile(shop);
    }
}
