package edu.utn;

public interface Observed {

    void suscribe(Observer afiliate);
    void unSuscribe(Observer afiliate);
    void sendNotification(String companyName, JobsCategory jobsCategory, String searchMessage);

}
