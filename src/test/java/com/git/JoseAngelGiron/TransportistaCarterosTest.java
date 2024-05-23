package com.git.JoseAngelGiron;


import com.github.JoseAngelGiron.Punto;
import com.github.JoseAngelGiron.Transportista;
import com.github.JoseAngelGiron.TransportistaCarteros;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransportistaCarterosTest {

    static TransportistaCarteros miTransportistaCarteros;

    @BeforeAll
    public static void setUpClass(){
        miTransportistaCarteros = new TransportistaCarteros();
    }

    @Test
    @DisplayName("Distancia mayor que peso y costo de envío mayor a 25")
    void testDistanciaMayorQuePeso() throws Transportista.EnvioNoDisponibleException {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(15, 15);
        double peso = 2;
        double costoEsperado = 15*3;
        double costoCalculado = miTransportistaCarteros.presupuestar(origen, destino, peso);

        Assertions.assertEquals(costoCalculado, costoEsperado, "El costo de envío debe ser tres veces el esperado");
        assertTrue(costoCalculado >= 25, "El costo de envío debe ser mayor o igual a 25");
    }

    @Test
    @DisplayName("Distancia menor o igual que peso y costo de envío mayor o igual a 25")
    void testDistanciaMenorIgualQuePeso() throws Transportista.EnvioNoDisponibleException {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(10, 10);
        double peso = 15;
        double costoEsperado = peso * 2;
        double costoCalculado = miTransportistaCarteros.presupuestar(origen, destino, peso);

        Assertions.assertEquals(costoEsperado, costoCalculado, "El costo de envío debe ser igual al doble del peso");
        assertTrue(costoCalculado >= 25, "El costo de envío debe ser mayor o igual a 25");
    }


    @Test
    @DisplayName("Costo de envío menor de 25")
    void testCostoEnvioMenorDe25() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(5, 5);
        double peso = 10;
        assertThrows(Transportista.EnvioNoDisponibleException.class, () ->
                miTransportistaCarteros.presupuestar(origen, destino, peso));
    }
}
