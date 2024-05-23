package com.github.JoseAngelGiron;

import javafx.scene.paint.Color;

public class TransportistaSeul extends Transportista {
    public TransportistaSeul(String nombre, String color, Distancia medida) {
        super("fede", "Naranja", medida);
    }
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
