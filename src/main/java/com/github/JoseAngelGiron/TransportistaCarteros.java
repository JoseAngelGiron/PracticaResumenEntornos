package com.github.JoseAngelGiron;



public class TransportistaCarteros extends Transportista{

    /**
     * Calcula el costo de envío entre dos puntos basado en la distancia y el peso del paquete.
     * Si el costo de envío es menor que 25, lanza una excepción.
     *
     * @param origen  el punto de origen del envío
     * @param destino el punto de destino del envío
     * @param peso    el peso del paquete a enviar
     * @return el costo de envío
     * @throws EnvioNoDisponibleException si el costo de envío es menor que 25
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
