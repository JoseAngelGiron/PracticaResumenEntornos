package com.git.jcapitanmoreno;

import com.github.JoseAngelGiron.Punto;
import com.github.JoseAngelGiron.Transportista;
import com.github.JoseAngelGiron.TransportistaCarteros;
import com.github.JoseAngelGiron.TransportistaFede;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransportistaFedeTest {

    static TransportistaFede transportistaFede;

    @BeforeAll
    public static void setUpClass(){
        transportistaFede = new TransportistaFede();
    }
    /**
     * Prueba que verifica el cálculo del costo de envío cuando la distancia es mayor a 10 km y menor que 100 km.
     *
     * @throws Transportista.EnvioNoDisponibleException si la distancia no está soportada.
     */
    @Test
    @DisplayName("Distancia mayor que 10")
    void testDistanciaMayorA10() throws Transportista.EnvioNoDisponibleException {
        TransportistaFede transportistaFede = new TransportistaFede();
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(15, 15);
        double peso = 15;

        double distancia = Math.abs(destino.getX() - origen.getX()) + Math.abs(destino.getY() - origen.getY());
        assertTrue(distancia > 10 && distancia < 100, "La distancia debe ser mayor a 10 y menor que 100");

        double costoCalculado = transportistaFede.presupuestar(origen, destino, peso);
        double costoEsperado = (peso * distancia) / 2;

        Assertions.assertEquals(costoEsperado, costoCalculado, "El costo de envío debe ser igual al resultado del cálculo esperado");
        assertTrue(costoCalculado >= 25, "El costo de envío debe ser mayor o igual a 25");
    }

    /**
     * Prueba que verifica si se lanza una excepción cuando el costo de envío es menor que 10.
     */
    @Test
    @DisplayName("Costo de envío menor de 10")
    void testCostoMenorQue10() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(5, 5);
        double peso = 10;
        assertThrows(Transportista.EnvioNoDisponibleException.class, () ->
                transportistaFede.presupuestar(origen, destino, peso));
    }
}
