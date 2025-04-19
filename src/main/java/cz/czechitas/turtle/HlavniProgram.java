package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.

        Color cervenaBarva;
        cervenaBarva = new Color(255, 0, 0);
        Color cernaBarva;
        cernaBarva = new Color(0, 0, 0);
        /*
        posun(-400, 0);
        naklesliCtverec(90.5, cervenaBarva);
        posun(150, 0);
        naklesliObdelnik(70.74, 36.92, new Color(0, 200, 0));
        posun(100, 0);
        naklesliRovnostrannyTrojuhelnik(111.4, cervenaBarva);
        posun(150, 0);
        naklesliRovnoramennyPravouhlyTrojuhelnik(83.6, new Color(0, 100, 250));
        posun(200, 0);
        naklesliRovnoramennyTrojuhelnik(73, 55, cervenaBarva);
        posun(150, 0);
        nakresliKruznici(70, new Color(255, 0, 255));
        */

        // Zmrzlina
        posun(-350, 30);

        zofka.turnLeft(180);
        naklesliRovnoramennyTrojuhelnik(250.25, 70, new Color(200, 150, 0));
        zofka.turnLeft(180);
        posun(0, 60);
        nakresliKruznici(102.25, cervenaBarva);
        posun(0, -60);

        posun(350, -30);

        // Sněhulák
        Color svetleModraBarva;
        svetleModraBarva = new Color(0, 150, 250);
        posun(-50, 50);

        nakresliKruznici(74.87, svetleModraBarva);
        posun(0, -175);
        nakresliKruznici(100.13, svetleModraBarva);
        posun(0, 300.26);
        nakresliKruznici(50.39, svetleModraBarva);
        posun(-98.51, -125.26);
        nakresliKruznici(23.64, svetleModraBarva);
        posun(197.02, 0);
        nakresliKruznici(23.64, svetleModraBarva);
        posun(-98.51, 0);

        posun(50, -50);

        // Mašinka
        posun(320, -70);

        naklesliObdelnik(200, 120.5, cervenaBarva);
        posun(60.25, 0);
        nakresliKruznici(60.25, cernaBarva);
        posun(-60.25, 0);
        zofka.turnLeft(90);
        naklesliObdelnik(180, 110, cervenaBarva);
        zofka.move(180);
        naklesliRovnoramennyPravouhlyTrojuhelnik(110, new Color(0, 0, 250));
        zofka.turnRight(90);
        posun(45, -30.225);
        nakresliKruznici(30.225, cernaBarva);
        posun(80, 0);
        nakresliKruznici(30.225, cernaBarva);
        posun(55, 30.225);

        posun(-320, 70);
    }

    public void naklesliCtverec(double delkaStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    public void naklesliObdelnik(double delkaPrvniStrany, double delkaDruheStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaPrvniStrany);
            zofka.turnRight(90);
            zofka.move(delkaDruheStrany);
            zofka.turnRight(90);
        }
    }

    public void posun(double x, double y) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(x);
        zofka.turnLeft(90);
        zofka.move(y);
        zofka.penDown();
    }

    public void naklesliRovnostrannyTrojuhelnik(double delkaStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.turnRight(30);
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(120);
        }
        zofka.turnLeft(30);
    }

    public void naklesliRovnoramennyPravouhlyTrojuhelnik(double velikostPrepony, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.turnRight(45);
        var velikostOdvesny = Math.sqrt(Math.pow(velikostPrepony, 2) / 2);
        zofka.move(velikostOdvesny);
        zofka.turnRight(90);
        zofka.move(velikostOdvesny);
        zofka.turnRight(135);
        zofka.move(velikostPrepony);
        zofka.turnRight(90);
    }

    public void naklesliRovnoramennyTrojuhelnik(double odvesna, int uhelUPrepony, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.turnLeft(90);
        var x = (Math.cos(Math.toRadians(uhelUPrepony))) * odvesna;
        zofka.move(x);
        zofka.turnRight(180 - uhelUPrepony);
        zofka.move(odvesna);
        zofka.turnRight(2 * uhelUPrepony);
        zofka.move(odvesna);
        zofka.turnRight(180 - uhelUPrepony);
        zofka.move(x);
        zofka.turnRight(90);
    }

    public void nakresliKruznici(double polomer, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        double pi = Math.PI;
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(polomer);
        zofka.turnRight(90);
        zofka.penDown();
        for (int i = 0; i < 360; i++) {
            zofka.turnRight(1);
            zofka.move((2 * pi * polomer) / 360);
        }
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(polomer);
        zofka.turnLeft(90);
        zofka.penDown();
    }

}
