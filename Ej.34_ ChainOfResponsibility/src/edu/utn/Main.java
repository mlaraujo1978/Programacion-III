package edu.utn;


public class Main {

    public static void main(String[] args) {

        BankStaff manager = new Manager();
        BankStaff boss = new Boss(manager);
        BankStaff employee = new Employee(boss);

        employee.approvalRequest(0);
        System.out.println("======================================================");
        employee.approvalRequest(40000);
        System.out.println("======================================================");
        employee.approvalRequest(10000);
        System.out.println("=======================================================");
        employee.approvalRequest(119000);
        System.out.println("=======================================================");
        employee.approvalRequest(150000);

    }
}
