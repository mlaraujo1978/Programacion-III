package edu.utn;

public class Manager extends BankStaff {

    private final int MAX_APPROVAL = 120000;

    public Manager() {  }

    public Manager(BankStaff bankStaff) {
        super(bankStaff);
    }

    public void approvalRequest(int approvalAmount) {

               if(approvalAmount <= MAX_APPROVAL){
                System.out.println("Autoriza el Gerente.");
            }
            else { System.out.println("El monto excede lo permitido para la aprobación.");
            }
        }
    }

