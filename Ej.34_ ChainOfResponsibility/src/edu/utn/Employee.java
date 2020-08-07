package edu.utn;

public class Employee extends BankStaff {

    private final int MAX_APPROVAL = 10000;

    public Employee() { };

    public Employee(BankStaff bankStaff) {
        super(bankStaff);
    }

    public void approvalRequest(int approvalAmount) {

        if(approvalAmount <= 0){
            System.out.println("ERROR!, el importe debe ser mayor a 0.");
            return;
        }

        if(approvalAmount <= MAX_APPROVAL){
            System.out.println("Autoriza el Empleado.");
        }
        else if (getBankStaff()!=null){
            getBankStaff().approvalRequest(approvalAmount);
        }

    }
}
