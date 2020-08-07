package edu.utn.entity.company;

import java.util.ArrayList;
import java.util.List;

public class CompanyPool implements Warranty {

    private String name;
    private List<Investor> investors;

    public CompanyPool (String name){
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String name) { this.name = name; }

    public void add(Investor investor) {
        if (investors == null){
            investors = new ArrayList<>();
        }
        investors.add(investor);
    }

    @Override
    public int getCapital() {
        int capital = 0;

        for (int i = 0 ; i< investors.size(); i++){
            capital += investors.get(i).getCapital();
        }

        return capital;
    }
}








