package com.github.JoseAngelGiron;


public class DistanciaCrane extends Distancia{
    @Override
    public double medir(Punto origen, Punto destino) {
        return Math.max(Math.abs(destino.getX() - origen.getX()), Math.abs(destino.getY() - origen.getY()));
    }

}


