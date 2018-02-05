package main.java.by.tc.task02.entity;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    private Map<SportEquipment,Integer> goods = new HashMap<>();

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public void add(SportEquipment unit,Integer value){
        this.goods.put(unit,value);
    }

    public void add(Map<SportEquipment,Integer> goods){
        this.goods.putAll(goods);
    }

    public void setGoods(Map<SportEquipment, Integer> goods) {
        this.goods = goods;
    }
}
