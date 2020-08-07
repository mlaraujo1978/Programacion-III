package edu.utn;

public class Transport {

    private Route route;

     Transport(Route route){
         this.route = route;
     }

    public Route getRoute() {   return route;    }
    public void setRoute(Route route) { this.route = route;  }

    public int getTime() {
         return route.getTime();
    }

     public void printInfoRoute (){
         System.out.println("El tiempo estimado para la ruta elegida es de: "+ route.getTime() + " mins.");
         System.out.println("================================================================");
     }

}
