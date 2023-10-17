package com.SAM.Naves.asteroide;

import com.SAM.Naves.nave.Nave;
import com.SAM.Naves.objeto.Objeto;

public class Asteroide extends Objeto {

    //ATRIBUTOS
    private Integer lesion;

    //CONSTRUCTORES

    public Asteroide(Integer posicionx, Integer posiciony, Character direccion, Integer lesion) {
        super(posicionx, posiciony, direccion);
        this.lesion = lesion;
    }


    //GETER AND SETTER


    //METODOS
    public void asteroide(Nave nave){
        Integer vida = nave.getVida();
        vida -= lesion;
        nave.setVida(vida);
        System.out.println("La nave perdio vida por colicion con asteroide: vida actual: " + nave.getVida());
    }

    @Override
    public String irA(Character direccion) {
        switch (direccion){
            case 'N':
            case 'S':
            case 'E':
            case 'O':
                    return "Moviendo asteroide a la direccion " + direccion;
            default:
                return "Letra ingresada no valida para la direccion, letras validas: N, S, E, O";
        }
    }

    @Override
    public String toString() {
        return "Asteroide" + super.toString() +
                "lesion=" + lesion +
                '}';
    }
}
