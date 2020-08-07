package edu.utn.businessRule;

import edu.utn.entity.PubOrg.Level;

public class BusinessRulePubOrg extends BusinessRule {

/*•	Si el solicitante fuera un organismo público, el monto máximo será un valor pautado según el nivel del organismo.
 Actualmente hay tres niveles: Nacional, Provincial y Autárquico, cada uno con un máximo propio.
  Se debe tener en cuenta que los organismos pueden cambiar de nivel (por ejemplo pasar de Nación a Provincia).*
* */

    public int getAmountLoan(Level level){

        int amountLoan = level.getAmount();

       return amountLoan;
    }



}
