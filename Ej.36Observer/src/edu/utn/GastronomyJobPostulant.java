package edu.utn;

public class GastronomyJobPostulant implements Observer {

    private String email;
    private JobsCategory jobsCategory;

    public GastronomyJobPostulant (String email, JobsCategory jobsCategory){
        this.email = email;
        this.jobsCategory =jobsCategory;
    }
    public String getEmail() {return email; }
    public JobsCategory getJobsCategory() { return jobsCategory; }

    @Override
    public void newJobOfertNotification(String mail, String companyName, JobsCategory jobsCategory, String message) {
        if (jobsCategory == JobsCategory.GASTRONOMY){

            System.out.println(  sendNewJobOfert()+"\nEmail:"+ mail +"\nLa empresa " + companyName + " busca cubrir puestos de " +  message  );
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    public String sendNewJobOfert() {
       return  "Se Agregó una nueva busqueda en la categoria Gastronomia!!.";

    }
}
