package edu.utn.entity.company;

public class Company implements Warranty {

    private String name;
    private Warranty warranty;

    public Company(String name, Warranty warranty){
        this.name = name;
        this.warranty = warranty;
    }

    public String getName() {  return name; }
    public void setName(String name) { this.name = name;  }

    @Override
    public int getCapital() {
        return warranty.getCapital();
    }
}
