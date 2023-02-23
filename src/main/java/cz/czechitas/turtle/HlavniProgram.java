package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        //Zmrzka
        zofka.setLocation(150.0,150.0);
       nakresliBarevniRovnostrannyTrojuhelnik(125,Color.darkGray);

       zofka.setLocation(150.0,150.0);
       zofka.turnLeft(90);
       nakresliBarevniKolecko(3,25,Color.yellow);

       //Masinka
       zofka.setLocation(600.0,400.0);
       zofka.turnLeft(105);
       nakresliObdelnik(200,100,Color.BLACK);

       zofka.setLocation(910,400);
       zofka.turnLeft(90);

       nakresliObdelnik(200,100,Color.MAGENTA);

       zofka.setLocation(797,390);
       nakresliBarevniKolecko(3,25,Color.gray);


       zofka.setLocation(597,350);
       zofka.turnLeft(45);

       nakresliBarevniRovnostrannyTrojuhelnik(125, Color.GREEN);

      zofka.setLocation(640,435);
      zofka.turnRight(90);

      nakresliBarevniKolecko(1,10,Color.GREEN);


      zofka.setLocation(730,428);
      nakresliBarevniKolecko(1,10,Color.GREEN);

      //Snehulak

        zofka.setLocation(300,150);
        nakresliBarevniKolecko(2,12,Color.blue);

        zofka.setLocation(290,220);
        nakresliBarevniKolecko(6,15,Color.blue);

        zofka.setLocation(280,310);
        nakresliBarevniKolecko(6,25,Color.blue);

        zofka.setLocation(260,220);
        nakresliBarevniKolecko(0.5,5,Color.blue);

        zofka.setLocation(395,220);
        nakresliBarevniKolecko(0.5,5,Color.blue);

        zofka.setLocation(600,220);









    }
    public void nakresliBarevniRovnostrannyTrojuhelnik(double velikostStrany, Color barva) {
        zofka.setPenColor(barva);
        zofka.turnLeft(90);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
    }
 public void nakresliBarevniKolecko(double velikostStranyA, double velikostStranyB, Color barva) {
    zofka.setPenColor(barva);
    for (int i = 0; i < 15; i++) {
        zofka.move(velikostStranyA);
        zofka.turnRight(25);
        zofka.move(velikostStranyB);
    }


}
 public void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color barva){
        zofka.setPenColor(barva);
     for (int i = 0; i < 2; i++) {
         zofka.move(delkaStranyA);
         zofka.turnLeft(90);
         zofka.move(delkaStranyB);
         zofka.turnLeft(90);

     }
 }

 public void nakresliBarevniCtverec(double delkaStrany, Color barva){
        zofka.setPenColor(barva);
     for (int i = 0; i < 4; i++) {
         zofka.move(delkaStrany);
         zofka.turnLeft(90);

     }
 }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
