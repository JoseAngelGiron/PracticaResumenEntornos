package com.github.JoseAngelGiron;


public class DistanciaCrane extends Distancia{
    @Override
    public double medir(Punto origen, Punto destino) {
        double distancia = Math.max(Math.abs(destino.getX() - origen.getX()), Math.abs(destino.getY() - origen.getY()));
        return distancia;
    }

}


