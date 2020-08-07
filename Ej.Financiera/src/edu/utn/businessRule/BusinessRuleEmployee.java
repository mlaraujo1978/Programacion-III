package edu.utn.businessRule;

public class BusinessRuleEmployee extends BusinessRule{

/*
Se  le  presta  un  monto equivalente  al  valor  total  de  sus  bienes  registrados  menos  un porcentaje fijado por cada hijo,
que actualmente es del 10%, pero podría  modificarse  en  un  futuro.
 Ejemplo: tiene una casa de 160, un auto de 25, otro bien de 15 y 3 hijos, entonces se le podría prestar 140 (200 – 30% de 200)
*/

    private static final int CHILD_PERCENTAGE = 10;
    private static final int TOTAL_PERCENTAGE = 100;

    public int getAmountLoan(int capital, int quantityChild) {

        int percentage = getTotalPercentage(quantityChild);

        int totalAmountLoan = capital-(capital*percentage/TOTAL_PERCENTAGE);

        return totalAmountLoan;
    }

    protected int getTotalPercentage(int quantityChild) {

        int totalPercentage = quantityChild*CHILD_PERCENTAGE;

        return totalPercentage;
    }
}

