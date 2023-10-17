package com.SAM.Naves.nave;

import com.SAM.Naves.objeto.Objeto;

public class Nave extends Objeto {

    //ATRIBUTOS

    private Double velocidad;
    private Integer vida;

    // CONSTRUCTORES

    public Nave(Integer posicionx, Integer posiciony, Character direccion, Double velocidad, Integer vida) {
        super(posicionx, posiciony, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }


    //GETTER AND SETTER


    public Double getVelocidad() {
        return velocidad;
    }

    public Integer getVida() {
        return vida;
    }

    public int setVida(Integer vida) {
        this.vida = vida;
        return this.vida;
    }

    //METODOS
    public String velocidadNave(double velocidad){
        switch ((int)velocidad){
            case 1:
                String vel1 = irA(1);
                return vel1;
            case 2:
                String vel2 = irA(2);
                return vel2;
            case 3:
                String vel3 = irA(3);
                return vel3;
            case 4:
                String vel4 = irA(4);
                return vel4;
            case 5:
                String vel5 = irA(5);
                return vel5;
            default:
                return "El numero ingresado de velociodad es incorrecto debe ser del 1 al 5";


        }
    }

    public String girar(Character direccion){
        switch (direccion){
            case 'N':
            case 'S':
            case 'E':
            case 'O':
                this.setDireccion(direccion);
                return "se actualizo la direccion a: " + getDireccion();
            default:
                return "Letra ingresada no valida para la direccion, letras validas: N, S, E, O";
        }
    }
    public String restarVida(){
        this.vida -= 1;
        return "Vida de la nave resto 1 punto, vida actual: " + this.vida;
    }

    @Override
    public String irA(Character direccion) {
        switch (direccion){
            case 'N':
            case 'S':
            case 'E':
            case 'O':
                if (this.getDireccion() == direccion)
                    return "Moviendo la nave a la direccion " + irA(direccion);
                else
                    return "Debes girar a la direccion a la que quiere ir";
            default:
                return "Letra ingresada no valida para la direccion, letras validas: N, S, E, O";
        }
    }

    public String irA(int velocidad){
        int valorX = getPosicionx();
        int valorY = getPosiciony();
        valorY += velocidad;
        valorX += velocidad;
        setPosicionx(valorX);
        setPosiciony(valorY);


        return "La posicion de la nave x/y: " + getPosicionx() + "/" + getPosiciony();
    }

    @Override
    public String toString() {
        return "Nave{" + super.toString() +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }
}
