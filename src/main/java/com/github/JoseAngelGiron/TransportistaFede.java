package com.github.JoseAngelGiron;

public class TransportistaFede extends Transportista {


    public TransportistaFede(String nombre, String color, Distancia medida) {
        super("Fede", "Marron", new DistanciaManhattan());
    }

    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException {
        double distancia = medida.medir(origen, destino);
        double coste = 0;
        if(distancia<10){
            coste =5;
        }else if (distancia >10 && distancia<100){
            coste = peso * distancia /2;
        }else {
            throw new EnvioNoDisponibleException(
                    "Lo sentimos, la distancia no esta soportada. Disculpe las molestias"
            );
        }
        return coste;
    }
}

