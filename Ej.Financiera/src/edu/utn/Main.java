package edu.utn;

import edu.utn.entity.customer.Customer;
import edu.utn.entity.customer.CustomerFactory;
import edu.utn.entity.company.*;
import edu.utn.entity.employee.Asset;
import edu.utn.entity.employee.Employee;
import edu.utn.entity.PubOrg.Level;
import edu.utn.entity.PubOrg.PublicOrganization;
import edu.utn.entity.loan.Loan;

public class Main {

    public static void main(String[] args) {

        //CustomerEMPLOYEE

        Employee employee1 = new Employee("Juan Perez", 3);
        employee1.add(new Asset("house", 160));
        employee1.add(new Asset("car", 25));
        employee1.add(new Asset("car", 15));

        Customer customerEmp1 = new CustomerFactory().createEmployee(employee1);
        customerEmp1.calculateLoan();

        Loan loan1 = new Loan(employee1.getName(), 050520, 300);
        customerEmp1.asignLoan(customerEmp1.calculateLoan(),loan1);

        customerEmp1.calculateLoan();
        Loan loan2 = new Loan(employee1.getName(), 050620, 0);
        customerEmp1.asignLoan(customerEmp1.calculateLoan(),loan2);

 //______________________________________________________________________________________________________________

        //CustomerPUBLIC_ORG

        PublicOrganization publicOrg1 = new PublicOrganization("ANSES", Level.NATIONAL);
        Customer customerPubOrg = new CustomerFactory().createPubOrg(publicOrg1);
        customerPubOrg.calculateLoan();

        Loan loan3 = new Loan (publicOrg1.getName(), 100720, 200);
        customerPubOrg.asignLoan(customerPubOrg.calculateLoan(),loan3);
        customerPubOrg.calculateLoan();
//______________________________________________________________________________________________________________

        //CustomerCOMPANY_GUARANTEE.FUND

        GuaranteeFund guaranteeFund1 = new GuaranteeFund("Fernandez Company S.A", 500);
        Company company1 = new Company("Los Robles S.R.L", guaranteeFund1);

        Customer customerComp1 = new CustomerFactory().createCompany(company1);
        customerComp1.calculateLoan();
        Loan loan4 = new Loan(company1.getName(), 100720, 290);
        customerComp1.asignLoan(customerComp1.calculateLoan(),loan4);
        customerComp1.calculateLoan();

//______________________________________________________________________________________________________________

        //CustomerCOMPANY_COMPANY.POOL

        CompanyPool companyPool1 = new CompanyPool("Holding A");
        companyPool1.add(new Investor("PEPE S.A", 150));
        companyPool1.add(new Investor("PEPA S.A", 300));
        companyPool1.add(new Investor("PEPITO S.A", 150));

        Company company2 = new Company("Los Cedros S.R.L", companyPool1);

        Customer customerComp2 = new CustomerFactory().createCompany(company2);
        customerComp2.calculateLoan();

        Loan loan5 = new Loan(company2.getName(), 100720, 310);
        customerComp2.asignLoan( customerComp2.calculateLoan(),loan5);

        customerComp2.calculateLoan();
    }
}
