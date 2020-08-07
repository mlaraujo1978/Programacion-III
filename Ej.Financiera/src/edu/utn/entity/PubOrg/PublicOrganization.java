package edu.utn.entity.PubOrg;

public class PublicOrganization {

    private String name;
    private Level level;

    public PublicOrganization (String name, Level level){
        this.name = name;
        this.level = level;
    }

    public String getName() {return name;}
    public void setName(String name) { this.name = name; }

    public Level getLevel() {  return level; }
    public void setLevel(Level level) {  this.level = level; }


}
