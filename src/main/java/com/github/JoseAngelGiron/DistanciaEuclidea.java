package com.github.JoseAngelGiron;

public class DistanciaEuclidea extends Distancia{
    /**
     * Calcula la distancia euclidiana entre dos puntos en un espacio bidimensional.
     * @param origen El punto de origen.
     * @param destino El punto de destino.
     * @return La distancia euclidiana entre el punto de origen y el punto de destino.
     */
    @Override
    public double medir(Punto origen, Punto destino) {
        double distancia = Math.sqrt(Math.pow(destino.getX() - origen.getX(), 2) + Math.pow(destino.getY() - origen.getY(), 2));
        return distancia;
    }
}
