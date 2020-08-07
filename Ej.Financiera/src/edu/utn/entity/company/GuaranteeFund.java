package edu.utn.entity.company;

public class GuaranteeFund implements Warranty{

    private String name;
    private int capital;

    public GuaranteeFund (String name, int capital){
        this.name = name;
        this.capital = capital;
    }

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public int getCapital() { return capital; }
    public void setCapital(int capital) {  this.capital = capital;  }


}
