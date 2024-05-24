package com.github.JoseAngelGiron;

public class DistanciaManhattan extends Distancia {

    /**
     * Calcula la distancia Manhattan entre dos puntos.
     * La distancia Manhattan se calcula como la suma de las diferencias absolutas
     * de las coordenadas X e Y de los dos puntos.
     *
     * @param origen El punto de origen.
     * @param destino El punto de destino.
     * @return La distancia Manhattan entre los dos puntos.
     * hola (prueba de actions)
     */
    @Override
    public double medir(Punto origen, Punto destino) {
        return Math.abs(destino.getX() - origen.getX()) + Math.abs(destino.getY() - origen.getY());
    }
}
