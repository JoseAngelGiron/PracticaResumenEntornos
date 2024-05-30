package com.github.JoseAngelGiron;

public class TransportistaCarteros extends Transportista{

    /**
     * Calcula el costo de envío entre dos puntos en base a la distancia y el peso del envío.
     *
     * @param origen El punto de origen del envío.
     * @param destino El punto de destino del envío.
     * @param peso El peso del envío.
     * @return El costo del envío calculado.
     * @throws EnvioNoDisponibleException Si el costo de envío calculado es menor de 25.
     *
     * @Author Jose Angel Girón
     */
    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException {

        double costeEnvio = 0;
        double distancia =medida.medir(origen, destino);
        if(distancia>peso){
            costeEnvio = distancia*3;
        } else if (distancia<=peso) {
            costeEnvio = peso*2;
        }

        if(costeEnvio<25){
            throw new EnvioNoDisponibleException("El costo de envío es menor de 25. Envío no disponible.");
        }

        return costeEnvio;
    }

    public TransportistaCarteros() {
        super("Carteros","amarillo", new DistanciaCrane() );
    }
}
