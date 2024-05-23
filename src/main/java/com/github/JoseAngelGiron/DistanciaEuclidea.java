package com.github.JoseAngelGiron;

public class DistanciaEuclidea extends Distancia{
    @Override
    public double medir(Punto origen, Punto destino) {
        double distancia = Math.sqrt(Math.pow(destino.getX() - origen.getX(), 2) + Math.pow(destino.getY() - origen.getY(), 2));
        return distancia;
    }
}
