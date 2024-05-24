package com.git.Frenadol;

import static org.junit.Assert.assertEquals;

import com.github.JoseAngelGiron.DistanciaEuclidea;
import com.github.JoseAngelGiron.Punto;
import org.junit.Test;

public class DistanciaEuclideaTest {

    @Test
    public void medir_DistanciaEntreOrigenYDestino_Correcta() {

        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(3, 4);
        DistanciaEuclidea distanciaEuclidea = new DistanciaEuclidea();


        double distanciaCalculada = distanciaEuclidea.medir(origen, destino);


        assertEquals(5, distanciaCalculada, 0.01);
    }

    @Test
    public void medir_DistanciaEntreOrigenYDestino_OrigenNegativo() {
        Punto origen = new Punto(-1, -2);
        Punto destino = new Punto(3, 4);
        DistanciaEuclidea distanciaEuclidea = new DistanciaEuclidea();


        double distanciaCalculada = distanciaEuclidea.medir(origen, destino);


        assertEquals(Math.sqrt(52), distanciaCalculada, 0.01);
    }

    @Test
    public void medir_DistanciaEntreOrigenYDestino_UnPuntoEnElOrigen() {

        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(0, 5);
        DistanciaEuclidea distanciaEuclidea = new DistanciaEuclidea();

        double distanciaCalculada = distanciaEuclidea.medir(origen, destino);


        assertEquals(5, distanciaCalculada, 0.01);
    }
}
