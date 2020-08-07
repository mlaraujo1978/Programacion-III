package edu.utn.businessRule;

import edu.utn.entity.PubOrg.Level;

public abstract class BusinessRule{

    int getAmountLoan(int capital) { return 0; }
    int getAmountLoan(int capital, int quantityChild){return 0;}
    int getAmountLoan(Level level){return 0;}

}
