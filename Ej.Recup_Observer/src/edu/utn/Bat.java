package edu.utn;

import java.util.ArrayList;
import java.util.List;

public class Bat implements Observed{

    private List<Observer> arms;


    protected void ControlWater( ) {

        Sample sample =  TestWater.takeSample();

        sendNotification(sample.getCode());

    }


    @Override
    public void activateArm(Observer arm) {

        if(arms == null ){
            arms = new ArrayList<>();
        }
        arms.add(arm);
    }

    @Override
    public void deactivateArm(Observer arm) {

      if (arms != null){
         arms.remove(arm);
      }

    }

    @Override
    public void sendNotification(String code) {

        boolean  notificationSent = false;

        for (int i =  0 ; i< arms.size(); i++){

        if( code.equals(arms.get(i).getCodes())){

            arms.get(i).NotificationMove(code);

            notificationSent = true;
        }

        }

        if(notificationSent == false){

            /// devuelvo la muestra, hago una lista con las muestras no pasadas.. etc

        }


    }
}
