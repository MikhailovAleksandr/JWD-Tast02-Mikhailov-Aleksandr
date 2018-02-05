package main.java.by.tc.task02.service;

import main.java.by.tc.task02.service.impl.RentServiceImpl;
import main.java.by.tc.task02.service.impl.ShopServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ShopService shopService = new ShopServiceImpl();

    private final RentService rentService = new RentServiceImpl();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public Service getService(String serviceName){

        switch(serviceName){
            case "Shop": return shopService;
            case "Rent": return rentService;
            default: return null;
        }
    }
}
