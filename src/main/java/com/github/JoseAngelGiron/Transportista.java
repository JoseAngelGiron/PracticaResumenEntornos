package com.github.JoseAngelGiron;

public abstract class Transportista {

    protected String nombre;
    protected String color;
    protected Distancia medida;

    public abstract double presupuestar(Punto origen, Punto destino, double peso);

    public class EnvioNoDisponibleException extends Exception {

        public EnvioNoDisponibleException(String message) {
            super(message);
        }
    }
}
