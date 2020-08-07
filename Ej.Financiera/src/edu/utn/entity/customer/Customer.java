package edu.utn.entity.customer;

import edu.utn.entity.stringToPrint.StringToPrint;
import edu.utn.entity.loan.Loan;

import java.util.ArrayList;
import java.util.List;

public abstract class  Customer {

    private List<Loan> loans;
    private static final int ZERO = 0;

    public void  asignLoan(int maxAsign, Loan loan ) {

        if (loan.getAmount() <= ZERO || loan.getAmount() > maxAsign) {
            System.out.println(StringToPrint.St6() + loan.getAmount());
            System.out.println(StringToPrint.St5() + StringToPrint.St0() + loan.getName() + StringToPrint.St3() + maxAsign);
        }

        if ( loan.getAmount() > ZERO && loan.getAmount() <= maxAsign ){
            add(loan);
        }
    }

    protected void add( Loan loan ) {
        if(loans == null){
            loans = new ArrayList<>();
        }
        loans.add(loan);

        System.out.println(StringToPrint.St2() + loan.getName() + StringToPrint.St3() + loan.getAmount()+"."+ StringToPrint.St4());
    }

    public int searchLoansAmount(String name) {
        int amount = 0;

        if (loans != null) {

            for (int i = 0; i < loans.size() ; i++) {

                if (loans.get(i).getName() == name) {
                    amount += loans.get(i).getAmount();
                }
            }
        }
        System.out.println( StringToPrint.St1() + name + StringToPrint.St3() + amount + "."+ StringToPrint.St4() );
        return amount;
    }

    public int calculateLoan( ){ return 0; }

}
