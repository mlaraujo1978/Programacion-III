package edu.utn.entity.customer;

import edu.utn.businessRule.BusinessRuleCompany;
import edu.utn.businessRule.BusinessRuleEmployee;
import edu.utn.businessRule.BusinessRulePubOrg;
import edu.utn.entity.company.Company;
import edu.utn.entity.employee.Employee;
import edu.utn.entity.PubOrg.PublicOrganization;

public class CustomerFactory {

    public CustomerEmployee createEmployee(Employee employee){

        BusinessRuleEmployee bR1 = new BusinessRuleEmployee();

        CustomerEmployee customerEmployee = new CustomerEmployee(bR1, employee);

       return customerEmployee;
    }

    public CustomerPubOrg createPubOrg(PublicOrganization publicOrganization){

        BusinessRulePubOrg RPO = new BusinessRulePubOrg();

        CustomerPubOrg customerPubOrg = new CustomerPubOrg(publicOrganization, RPO);

        return customerPubOrg;
    }

    public CustomerCompany createCompany(Company company){

        BusinessRuleCompany RC = new BusinessRuleCompany();

        CustomerCompany customerCompany = new CustomerCompany(company, RC);

        return customerCompany;
    }

}
