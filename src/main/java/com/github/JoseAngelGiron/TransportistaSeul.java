package com.github.JoseAngelGiron;

import javafx.scene.paint.Color;

public class TransportistaSeul extends Transportista {

    public TransportistaSeul(String nombre, String color, Distancia medida) {
        super("fede", "Naranja", medida);
    }
    /**
     * Calcula el costo de envío basado en la distancia euclidiana entre dos puntos y el peso del envío.
     *
     * @param origen El punto de origen del envío.
     * @param destino El punto de destino del envío.
     * @param peso El peso del envío.
     * @return El costo del envío basado en la distancia y el peso.
     * @throws IllegalArgumentException Si la distancia de envío supera los 100 unidades.
     */
    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) {
        DistanciaEuclidea distanciaEuclidea = new DistanciaEuclidea();
        double distanciaCalculada = distanciaEuclidea.medir(origen, destino);

        if (distanciaCalculada <= 10) {
            return 5;
        } else if (distanciaCalculada < 100) {
            return peso * distanciaCalculada / 2;
        } else {
            throw new IllegalArgumentException("La distancia de envío no está soportada");
        }
    }
}
