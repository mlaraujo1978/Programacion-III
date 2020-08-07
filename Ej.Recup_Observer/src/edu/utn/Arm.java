package edu.utn;

import java.util.List;

public class Arm implements Observer{

    private RoboticArms roboticArm;
    private int idArm;
    private List<String> codes;

    public void setIdArm(int idArm) {  this.idArm = idArm; }


    @Override
    public void NotificationMove(String code) {


        for (int i = 0; i < codes.size(); i++) {

            if (codes.get(i).equals(code)) {

                roboticArm.move(getIdArm());
            }
        }
    }

    @Override
    public int getIdArm() {return idArm; }


    @Override
    public List<String> getCodes() { return codes; }

   }
