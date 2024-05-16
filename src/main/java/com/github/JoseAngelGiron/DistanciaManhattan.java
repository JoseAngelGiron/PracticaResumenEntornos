package com.github.JoseAngelGiron;

public class DistanciaManhattan extends Distancia {

    @Override
    public double medir(Punto origen, Punto destino) {
        return Math.abs(destino - origen) + Math.abs(destino - origen);
    }
}
