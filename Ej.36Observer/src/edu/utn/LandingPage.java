package edu.utn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LandingPage implements Observed {

    private List<Observer> afiliates;

    public void addNewOfferJob(String companyName, JobsCategory jobsCategory, String SearchMessage) {

        sendNotification(companyName, jobsCategory, SearchMessage);
    }

    public void suscribe(Observer afiliate) {

            if (afiliates == null) {
                afiliates = new ArrayList<>();
            }
            afiliates.add(afiliate);

        System.out.println("Gracias por suscribirte "+afiliate.getEmail()+" a la categoria: "+ afiliate.getJobsCategory()+".");
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public void unSuscribe(Observer afiliate) {

            if (afiliates != null) {
                afiliates.remove(afiliate);
            }

        System.out.println("Sentimos " + afiliate.getEmail() +" que te desuscribas :( a la categoria: "+ afiliate.getJobsCategory() +".");
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public void sendNotification (String companyName, JobsCategory jobsCategory, String searchMessage){

                if (afiliates == null) return;

                for (Observer afiliate : afiliates) {
                    afiliate.newJobOfertNotification(afiliate.getEmail(), companyName, jobsCategory,searchMessage);
                }

            }

}

