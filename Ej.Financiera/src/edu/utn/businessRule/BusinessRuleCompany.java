package edu.utn.businessRule;

public class BusinessRuleCompany extends BusinessRule{

    private static final int MULTIPLIER = 2;

/*
* •	Debe tener un aval de un tercero que puede ser un Fondo de Garantías o un Pool de empresas.
* En caso que presente un Fondo de Garantía, el monto máximo será el doble del capital de dicho fondo.
* Si presentara un Pool de empresas será el doble de la sumatoria de los capitales sociales de cada empresa que lo integra.
* */
    public int getAmountLoan(int capital) {

    int totalAmountLoan = capital*MULTIPLIER;

    return totalAmountLoan;
}


}
