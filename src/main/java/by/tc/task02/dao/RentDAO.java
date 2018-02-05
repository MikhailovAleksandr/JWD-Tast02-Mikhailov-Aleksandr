package main.java.by.tc.task02.dao;

import main.java.by.tc.task02.entity.RentUnit;

import java.io.IOException;

public interface RentDAO extends DAO {

    RentUnit readFile() throws IOException;

    void writeInFile(RentUnit rentUnit) throws IOException;
}
