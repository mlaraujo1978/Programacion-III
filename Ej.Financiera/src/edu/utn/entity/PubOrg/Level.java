package edu.utn.entity.PubOrg;

public enum Level {

    NATIONAL(500), PROVINCIAL(250), AUTARCHIC(350);

    private int amount;

    private Level( int amount){
        this.amount = amount;
    }

    public int getAmount() { return amount; }


}
