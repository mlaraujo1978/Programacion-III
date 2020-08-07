package edu.utn.entity.customer;

import edu.utn.businessRule.BusinessRuleCompany;
import edu.utn.entity.company.Company;
import edu.utn.entity.stringToPrint.StringToPrint;

public class CustomerCompany extends Customer {

    private Company company;
    private BusinessRuleCompany businessRuleCompany;

    public CustomerCompany( Company company, BusinessRuleCompany businessRuleCompany){
        this.company = company;
        this.businessRuleCompany = businessRuleCompany;
    }

    @Override
    public int calculateLoan() {

        int totalLoan = businessRuleCompany.getAmountLoan(company.getCapital()) - searchLoansAmount(company.getName()) ;

        System.out.println( StringToPrint.St0() + company.getName()+ StringToPrint.St3() + totalLoan + StringToPrint.St4());

        return totalLoan;
    }

}
