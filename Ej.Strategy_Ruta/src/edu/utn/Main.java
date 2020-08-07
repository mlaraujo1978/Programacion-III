package edu.utn;

public class Main {

    public static void main(String[] args) {

        Route ruta1 = new RouteOne();
        Route ruta2 = new RouteTwo();

        Transport transport1 = new Transport(ruta1);
        transport1.printInfoRoute();

        Transport transport2 = new Transport(ruta2);
        transport2.printInfoRoute();

    }
}
