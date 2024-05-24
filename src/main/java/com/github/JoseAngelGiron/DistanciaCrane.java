package com.github.JoseAngelGiron;


public class DistanciaCrane extends Distancia{

    /**
     * Calcula la distancia de Crane entre dos puntos.
     * La distancia de Crane entre dos puntos es la mayor de sus diferencias
     * absolutas en alguna dimensión.
     *
     * @param origen  el punto de origen
     * @param destino el punto de destino
     * @return la distancia de Crane entre el punto de origen y el punto de destino
     */
    @Override
    public double medir(Punto origen, Punto destino) {
        return Math.max(Math.abs(destino.getX() - origen.getX()), Math.abs(destino.getY() - origen.getY()));
    }

}


