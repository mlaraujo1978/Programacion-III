package edu.utn.entity.customer;

import edu.utn.businessRule.BusinessRulePubOrg;
import edu.utn.entity.PubOrg.PublicOrganization;
import edu.utn.entity.stringToPrint.StringToPrint;

public class CustomerPubOrg extends Customer {

    private PublicOrganization publicOrganization;
    private BusinessRulePubOrg businessRulePubOrg;

    public CustomerPubOrg ( PublicOrganization publicOrganization, BusinessRulePubOrg businessRulePubOrg ){
        this.businessRulePubOrg = businessRulePubOrg;
        this.publicOrganization = publicOrganization;
    }

    @Override
    public int calculateLoan() {

        int totalLoan = businessRulePubOrg.getAmountLoan(publicOrganization.getLevel()) - searchLoansAmount(publicOrganization.getName());

        System.out.println( StringToPrint.St0() + publicOrganization.getName()+ StringToPrint.St3() + totalLoan + StringToPrint.St4());

        return totalLoan;
    }

}
