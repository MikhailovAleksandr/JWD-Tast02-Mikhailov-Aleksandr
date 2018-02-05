package main.java.by.tc.task02.dao;

import main.java.by.tc.task02.dao.impl.RentDAOImpl;
import main.java.by.tc.task02.dao.impl.ShopDAOImpl;

public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final ShopDAO shopDAO = new ShopDAOImpl();

    private final RentDAO rentDAO = new RentDAOImpl();

    public static DAOFactory getInstance() {
        return instance;
    }

    public DAO getDAO(String DAOName){

        switch(DAOName){
            case "Shop": return shopDAO;
            case "Rent": return rentDAO;
            default: return null;
        }
    }
}
