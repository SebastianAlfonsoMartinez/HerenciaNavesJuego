package com.SAM.Naves.objeto;

import java.util.Objects;

public abstract class Objeto {

    //  ATRIBUTOS
    private Integer posicionx;
    private Integer posiciony;
    private Character direccion;

    //CONSTRUCTORES

    public Objeto(Integer posicionx, Integer posiciony, Character direccion) {
        this.posicionx = posicionx;
        this.posiciony = posiciony;
        this.direccion = direccion;
    }


    //GETTER AND SETTER

    public Integer getPosicionx() {
        return posicionx;
    }

    public void setPosicionx(Integer posicionx) {
        this.posicionx = posicionx;
    }

    public Integer getPosiciony() {
        return posiciony;
    }

    public void setPosiciony(Integer posiciony) {
        this.posiciony = posiciony;
    }

    public Character getDireccion() {
        return direccion;
    }

    public void setDireccion(Character direccion) {
        this.direccion = direccion;
    }

    //METODOS

    public String irA (){
        this.posicionx++;
        this.posiciony++;
        return "La posicion de la nave x/y: " + posicionx + "/" + posiciony;
    }

    public abstract String irA(Character direccion);

    @Override
    public String toString() {
        return "Objeto{" +
                "posicionx=" + posicionx +
                ", posiciony=" + posiciony +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return Objects.equals(posicionx, objeto.posicionx) && Objects.equals(posiciony, objeto.posiciony) && Objects.equals(direccion, objeto.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posicionx, posiciony, direccion);
    }

}
