package main.java.by.tc.task02.entity;

import main.java.by.tc.task02.entity.category.Category;

public class SportEquipment {

    private Category category;

    private String title;

    private int price;

    public SportEquipment() {}

    public SportEquipment(Category category, String title, int price){

        this.category = category;
        this.title = title;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){ return true; }

        if(null == obj){ return false; }

        if(this.getClass() != obj.getClass()){ return false; }

        SportEquipment sportEquipment = (SportEquipment) obj;

        if(!this.category.equals(sportEquipment.category)){ return false; }

        if(!this.title.equals(sportEquipment.title)){ return false; }

        if(this.price != sportEquipment.price){ return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
