package main.java.by.tc.task02.dao;

import main.java.by.tc.task02.entity.Shop;
import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.RentCategory;

import java.io.IOException;
import java.util.List;

public interface ShopDAO extends DAO {

    Shop readFile() throws IOException;

    void writeInFile(Shop shop) throws IOException;

}
