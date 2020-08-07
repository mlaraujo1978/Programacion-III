package edu.utn;

public abstract class BankStaff {

    private BankStaff bankStaff;
    private int maxAmount;

    public BankStaff() {  }

    public BankStaff(BankStaff bankStaff) {
        this.bankStaff = bankStaff;
    }

    public BankStaff getBankStaff() {
        return bankStaff;
    }

    public void approvalRequest(int approvalAmount) {  }


}
