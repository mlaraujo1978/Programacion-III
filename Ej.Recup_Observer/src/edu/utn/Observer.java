package edu.utn;

import java.util.List;

public interface Observer {

    void NotificationMove(String code);
    public int getIdArm();
    public List<String> getCodes();


}
