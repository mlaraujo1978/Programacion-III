package edu.utn;

public interface Observer {

    String getEmail();
    JobsCategory getJobsCategory();

    void newJobOfertNotification(String mail, String companyName, JobsCategory jobsCategory, String message);


}
