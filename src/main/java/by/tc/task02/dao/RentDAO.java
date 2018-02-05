package main.java.by.tc.task02.dao;

import main.java.by.tc.task02.entity.RentUnit;

public interface RentDAO extends DAO {

    RentUnit readFile();

    void writeInFile(RentUnit rentUnit);
}
