package com.git.Frenadol;

import com.github.JoseAngelGiron.DistanciaEuclidea;
import com.github.JoseAngelGiron.Punto;
import com.github.JoseAngelGiron.TransportistaSeul;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransportistaSeulTest {

    @Test
    public void testPresupuestar() {
        TransportistaSeul transportistaSeul = new TransportistaSeul("nombre", "color", new DistanciaEuclidea());
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(3, 4);
        double peso = 10.0;
        double expected = 5.0;
        double actual = transportistaSeul.presupuestar(origen, destino, peso);
        assertEquals(expected, actual, 0.01);
    }

}
