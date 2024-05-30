package com.git.jcapitanmoreno;

import com.github.JoseAngelGiron.DistanciaManhattan;
import com.github.JoseAngelGiron.Punto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DistanciaManhattanTest {
    /**
     * Instancia estática de DistanciaManhattan utilizada para las pruebas.
     */
    static DistanciaManhattan distanciaManhattan;
    /**
     * Configuración inicial de la clase de prueba.
     * Este método se ejecuta una vez antes de todas las pruebas.
     */
    @BeforeAll
    public static void setUpClass() {
        distanciaManhattan = new DistanciaManhattan();
    }
    /**
     * Prueba que verifica la medición de la distancia entre dos puntos con las mismas coordenadas.
     */
    @Test
    @DisplayName("Comprobar mismas coordenadas")
    public void testMedirMismaCoordenada() {
        Punto origen = new Punto(5, 5);
        Punto destino = new Punto(5, 5);
        Assertions.assertEquals(0, distanciaManhattan.medir(origen, destino));
    }
    /**
     * Prueba que verifica la medición de la distancia entre dos puntos con diferente coordenada X.
     */
    @Test
    @DisplayName("Comprobar diferente coordenada X")
    public void testMedirDiferenteCoordenadaX() {
        Punto origen = new Punto(1, 1);
        Punto destino = new Punto(4, 1);
        double resultado = distanciaManhattan.medir(origen, destino);
        Assertions.assertEquals(3, resultado);
    }
    /**
     * Prueba que verifica la medición de la distancia entre dos puntos con diferente coordenada Y.
     */
    @Test
    @DisplayName("Comprobar diferente coordenadaY")
    public void testMedirDiferenteCoordenadaY() {
        Punto origen = new Punto(1, 1);
        Punto destino = new Punto(1, 5);
        double resultado = distanciaManhattan.medir(origen, destino);
        Assertions.assertEquals(4, resultado);
    }
    /**
     * Prueba que verifica la distancia entre dos puntos con diferentes coordenadas X e Y.
     */
    @Test
    @DisplayName("Comprobar diferentes coordenadasXY")
    public void testMedirDiferenteCoordenadaXY() {
        Punto origen = new Punto(3, 3);
        Punto destino = new Punto(7, 8);
        double resultado = distanciaManhattan.medir(origen, destino);
        Assertions.assertEquals(9, resultado);
    }
    /**
     * Prueba que verifica la distancia entre dos puntos con coordenadas negativas.
     */
    @Test
    @DisplayName("Comprobar numeros negativos")
    public void testMedirNegativos() {
        Punto origen = new Punto(-1, -1);
        Punto destino = new Punto(-4, -5);
        double resultado = distanciaManhattan.medir(origen, destino);
        Assertions.assertEquals(7, resultado);
    }
}
