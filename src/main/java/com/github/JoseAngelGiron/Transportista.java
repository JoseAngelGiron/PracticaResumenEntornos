package com.github.JoseAngelGiron;

public abstract class Transportista {

    protected String nombre;
    protected String color;
    protected Distancia medida;

    public Transportista(String nombre, String color, Distancia medida) {
        this.nombre = nombre;
        this.color = color;
        this.medida = medida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Distancia getMedida() {
        return medida;
    }

    public void setMedida(Distancia medida) {
        this.medida = medida;
    }

    public abstract double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException;

    public class EnvioNoDisponibleException extends Exception {

        public EnvioNoDisponibleException(String message) {
            super(message);
        }
    }
}
