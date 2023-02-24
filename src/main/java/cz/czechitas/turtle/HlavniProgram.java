package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        //Zmrzka
        zofka.setLocation(150.0,150.0);
       nakresliBarevniRovnostrannyTrojuhelnik(125,Color.darkGray);

       zofka.setLocation(149.5,130.0);
       zofka.turnLeft(90);
       nakresliBarevniKolecko(27.5,Color.yellow);

       //Masinka
       zofka.setLocation(600.0,400.0);
       zofka.turnLeft(105);
       nakresliObdelnik(200,100,Color.BLACK);

       zofka.setLocation(910,400);
       zofka.turnLeft(90);

       nakresliObdelnik(200,100,Color.GREEN);

       zofka.setLocation(797,400);
       nakresliBarevniKolecko(27,Color.black);


       zofka.setLocation(597,350);
       zofka.turnLeft(45);

       nakresliBarevniRovnostrannyTrojuhelnik(125, Color.GREEN);

      zofka.setLocation(640,430);
      zofka.turnRight(90);

      nakresliBarevniKolecko(10,Color.GREEN);


      zofka.setLocation(730,426);
      nakresliBarevniKolecko(10,Color.GREEN);

      //Snehulak

        zofka.setLocation(300,150);
        nakresliBarevniKolecko(15,Color.blue);

        zofka.setLocation(270,240);
        nakresliBarevniKolecko(28,Color.blue);

        zofka.setLocation(245,370);
        nakresliBarevniKolecko(40,Color.blue);

        zofka.setLocation(225,222);
        nakresliBarevniKolecko(10,Color.blue);

        zofka.setLocation(410,220);
        nakresliBarevniKolecko(10,Color.blue);

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
 public void nakresliBarevniKolecko(double velikostStrany, Color barva) {
    zofka.setPenColor(barva);
    for (int i = 0; i < 15; i++) {
        zofka.move(velikostStrany);
        zofka.turnRight(25);

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
