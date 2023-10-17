package com.SAM.Naves;

import com.SAM.Naves.asteroide.Asteroide;
import com.SAM.Naves.nave.Nave;
import com.SAM.Naves.objeto.Objeto;

public class Main {
    public static void main(String[] args) {

        Nave carchacha = new Nave(4, 5, 'S', 1.0, 100);
        System.out.println(carchacha.getPosicionx() + " --/-- " + carchacha.getPosiciony());
        System.out.println(carchacha.restarVida());
        carchacha.restarVida();
        System.out.println(carchacha.getVida());
        System.out.println("Hello world!");
        System.out.println(carchacha.irA(5));
        System.out.println(carchacha.getPosicionx() + " / " + carchacha.getPosiciony());
        System.out.println(carchacha.girar('N'));
        System.out.println(carchacha.irA(3));
        System.out.println(carchacha.getPosicionx() + " / " + carchacha.getPosiciony());
        Asteroide fugas = new Asteroide(8, 6, 'E', 20);
        fugas.asteroide(carchacha);
        System.out.println(fugas.irA('O'));
        System.out.println(carchacha.getPosicionx() + " / " + carchacha.getPosiciony());
        System.out.println(carchacha.velocidadNave(5));
        Nave polo = new Nave(9, 7, 'O', 2.3, 100);
        System.out.println(polo.equals(carchacha));
        System.out.println(polo.equals(polo));
        System.out.println(polo.hashCode());
        System.out.println(fugas.toString());

    }
}