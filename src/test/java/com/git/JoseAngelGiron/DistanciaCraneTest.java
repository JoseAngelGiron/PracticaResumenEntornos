package com.git.JoseAngelGiron;

import com.github.JoseAngelGiron.DistanciaCrane;
import com.github.JoseAngelGiron.Punto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DistanciaCraneTest {


    static DistanciaCrane miDistanciaCrane;

    @BeforeAll
    public static void setUpClass(){
        miDistanciaCrane = new DistanciaCrane();
    }

    @Test
    @DisplayName("Comprobar mismas coordenadas")
    public void testMedirMismaCoordenada() {
        Punto origen = new Punto(5, 5);
        Punto destino = new Punto(5, 5);
        Assertions.assertEquals(0, miDistanciaCrane.medir(origen, destino));
    }

    @Test
    @DisplayName("Comprobar diferente coordenada X")
    public void testMedirDiferenteCoordenadaX() {
        Punto origen = new Punto(1, 1);
        Punto destino = new Punto(4, 1);
        double resultado = miDistanciaCrane.medir(origen, destino);
        Assertions.assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Comprobar diferente coordenadaY")
    public void testMedirDiferenteCoordenadaY() {
        Punto origen = new Punto(1, 1);
        Punto destino = new Punto(1, 5);
        double resultado = miDistanciaCrane.medir(origen, destino);
        Assertions.assertEquals(4, resultado);
    }

    @Test
    @DisplayName("Comprobar diferentes coordenadasXY")
    public void testMedirDiferenteCoordenadaXY() {
        Punto origen = new Punto(3, 3);
        Punto destino = new Punto(7, 8);
        double resultado = miDistanciaCrane.medir(origen, destino);
        Assertions.assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Comprobar numeros negativos")
    public void testMedirNegativos() {
        Punto origen = new Punto(-1, -1);
        Punto destino = new Punto(-4, -5);
        double resultado = miDistanciaCrane.medir(origen,destino);
        Assertions.assertEquals(4, resultado);
    }
}
