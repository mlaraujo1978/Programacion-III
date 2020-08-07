package edu.utn;

public interface Observed {

    void activateArm(Observer arm);

    void deactivateArm(Observer arm);

    void sendNotification(String code);

}
