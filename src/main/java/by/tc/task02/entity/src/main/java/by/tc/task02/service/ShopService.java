package main.java.by.tc.task02.service;

import main.java.by.tc.task02.entity.Shop;
import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.RentCategory;

import java.util.List;

public interface ShopService extends Service {

    List<SportEquipment> rent(Shop shop, RentCategory rentCategory);

    Shop readFile();

    void writeInFile(Shop shop);
}
