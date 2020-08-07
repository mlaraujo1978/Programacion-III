package edu.utn.entity.loan;

public class Loan {

    private int issueDate;
    private int amount;
    private String name;


    public Loan (String name, int issueDate, int amount){
        this.name = name;
        this.issueDate = issueDate;
        this.amount = amount;
    }

    public int getIssueDate() {  return issueDate;  }
    public void setIssueDate(int issueDate) {  this.issueDate = issueDate; }

    public int getAmount() {  return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public String getName() { return name; }
    public void setName(String name) {this.name = name; }

}
