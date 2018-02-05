package main.java.by.tc.task02.dao.impl.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SportEquipmentPath {

    private static final String resourceDatabasePath;

    private static final SportEquipmentPath instance = new SportEquipmentPath();

    static {
        resourceDatabasePath = "resource_path.txt";
    }

    public static SportEquipmentPath getInstance(){
        return instance;
    }

    public String getPath(String purposeName){

        try {

            String resoursePathInfo;

            String filePurpose;

            String path;

            FileInputStream fstream = new FileInputStream(resourceDatabasePath);

            BufferedReader buffer = new BufferedReader(new InputStreamReader(fstream));

            while((resoursePathInfo = buffer.readLine()) != null){

                filePurpose = resoursePathInfo.split("[=]")[0].toLowerCase();

                if(purposeName.toLowerCase().equals(filePurpose.toLowerCase())){

                    path = resoursePathInfo.split("[=]")[1].toLowerCase();

                    return path;
                }
            }

            return null;
        }

        catch(Exception ex){
            return null;
        }
    }
}
