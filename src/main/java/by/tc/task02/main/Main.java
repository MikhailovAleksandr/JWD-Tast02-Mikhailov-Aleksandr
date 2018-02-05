package main.java.by.tc.task02.main;

import main.java.by.tc.task02.entity.RentUnit;
import main.java.by.tc.task02.entity.Shop;
import main.java.by.tc.task02.entity.SportEquipment;
import main.java.by.tc.task02.entity.category.Category;
import main.java.by.tc.task02.entity.category.RentCategory;
import main.java.by.tc.task02.service.RentService;
import main.java.by.tc.task02.service.ServiceFactory;
import main.java.by.tc.task02.service.ShopService;

import java.util.List;

public class Main {
 public static void main(String[] args){

     Shop shop;
     RentUnit rentUnit;
     List<SportEquipment> goods;
     RentCategory rentCategory;

     PrintInfo printer = PrintInfo.getInstance();

     ServiceFactory serviceFactory = ServiceFactory.getInstance();
     ShopService shopService = (ShopService) serviceFactory.getService("Shop");
     RentService rentService = (RentService) serviceFactory.getService("Rent");



     shop = shopService.readFile();
     rentUnit = rentService.readFile();

     rentCategory = new RentCategory();
     rentCategory.add(Category.TENNIS,"net");
     goods = shopService.rent(shop,rentCategory);
     rentService.addRent(rentUnit,goods);

     printer.print(shop);
     printer.print(rentUnit);

     shopService.writeInFile(shop);
     rentService.writeInFile(rentUnit);

 }
}
