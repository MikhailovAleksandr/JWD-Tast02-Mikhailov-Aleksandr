package main.java.by.tc.task02.entity.category;

import java.util.HashMap;
import java.util.Map;

public class RentCategory {

    private Map<Category,String> rentCategory = new HashMap<>();

    public void add(Category category,String title){

        if(rentCategory.size()<3) {
            rentCategory.put(category,title);
        }
    }

    public Map<Category,String> getRentCategory(){
        return rentCategory;
    }
}
