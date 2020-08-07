package edu.utn;

public class Boss extends BankStaff {

    private final int MAX_APPROVAL = 40000;

    public Boss() {   }

    public Boss(BankStaff bankStaff) {
        super(bankStaff);
    }

    public void approvalRequest(int approvalAmount) {

        if(approvalAmount <= MAX_APPROVAL){
            System.out.println("Autoriza el Jefe.");
        }
        else if (getBankStaff()!=null){
            getBankStaff().approvalRequest(approvalAmount);
        }

    }



}

