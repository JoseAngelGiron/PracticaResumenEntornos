package com.github.JoseAngelGiron;

public class TransportistaFede extends Transportista {


    /**
     * Constructor por defecto que inicializa el nombre, color y la medida de distancia.
     */
    public TransportistaFede() {
        super("Fede", "Marron", new DistanciaManhattan());
    }

    /**
     * Método para calcular el coste del envío basado en la distancia y el peso del paquete.
     *
     * @param origen El punto de origen del envío.
     * @param destino El punto de destino del envío.
     * @param peso El peso del paquete a enviar.
     * @return El coste del envío.
     * @throws EnvioNoDisponibleException si la distancia es 100 km o mayor.
     */
    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException {
        double distancia = medida.medir(origen, destino);
        double coste = 0;
        if(distancia<10){
            coste =5;
        }else if (distancia >10 && distancia<100){
            coste = (peso * distancia) /2;
        }else {
            throw new EnvioNoDisponibleException(
                    "Lo sentimos, la distancia no esta soportada. Disculpe las molestias"
            );
        }
        return coste;
    }
}

