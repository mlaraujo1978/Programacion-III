package edu.utn.entity.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int quantityChildren;
    private List<Asset> assets;

    public Employee(String name, int quantityChildren){
        setName(name);
        setQuantityChildren(quantityChildren);
    }

    public String getName() {return name;}
    public void setName(String name) { this.name = name; }

    public int getQuantityChildren() {  return quantityChildren; }
    public void setQuantityChildren(int quantityChildren) { this.quantityChildren = quantityChildren; }

    public void add(Asset asset) {
        if (assets == null){
            assets = new ArrayList<>();
        }
        assets.add(asset);
    }

    public int getTotalPriceAssets() {
        int sumPrice = 0;

        for (int i = 0 ; i< assets.size(); i++){
            sumPrice += assets.get(i).getPrice();
        }
        return sumPrice;
    }

}
