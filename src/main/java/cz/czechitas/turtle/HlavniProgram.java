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

    public void posun(int x, int y) {
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

    public void naklesliRovnoramennyPravouhlyTrojuhelnik(double delkaOdvesny, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.turnRight(45);
        zofka.move(delkaOdvesny);
        zofka.turnRight(90);
        zofka.move(delkaOdvesny);
        zofka.turnRight(135);
        var velikostPrepony = Math.sqrt(2 * Math.pow(delkaOdvesny, 2));
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
