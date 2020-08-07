package edu.utn.entity.customer;

import edu.utn.businessRule.BusinessRuleEmployee;
import edu.utn.entity.employee.Employee;
import edu.utn.entity.stringToPrint.StringToPrint;

public class CustomerEmployee extends Customer {

    private Employee employee;
    private BusinessRuleEmployee businessRuleEmployee;

    public CustomerEmployee(BusinessRuleEmployee businessRuleEmployee, Employee employee){
        this.businessRuleEmployee = businessRuleEmployee;
        this.employee = employee;
    }

    @Override
    public int calculateLoan() {

        int totalLoan = (businessRuleEmployee.getAmountLoan(employee.getTotalPriceAssets(),employee.getQuantityChildren())-searchLoansAmount(employee.getName()));

        System.out.println(StringToPrint.St0() + employee.getName()+ StringToPrint.St3() + totalLoan + StringToPrint.St4());

        return totalLoan;
    }

}
