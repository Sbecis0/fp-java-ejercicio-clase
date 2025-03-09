package test.java;

import org.example.calculadora.Calculadora; 
import org.junit.jupiter.api.Test; 

import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertThrows; // Importa assertThrows para manejar excepciones en pruebas


class CalculadoraTest {

    /**
     * Prueba el método sumar() de la clase Calculadora.
     * Se espera que la suma de 2 y 3 sea 5.
     */
    @Test
    void testSuma() {
        Calculadora calc = new Calculadora(); // Crea una instancia de Calculadora
        int resultado = calc.sumar(2, 3); // Llama al método sumar
        assertEquals(5, resultado, "La suma de 2 y 3 debería ser 5"); // Comprueba que el resultado es el esperado
    }

    /**
     * Prueba el método restar() de la clase Calculadora.
     * Se espera que la resta de 10 y 5 sea 5.
     */
    @Test
    void testResta() { // Se renombra a testResta() para mantener el formato camelCase
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(10, 5);
        assertEquals(5, resultado, "La resta de 10 y 5 debería ser 5"); // Se corrige el mensaje de error
    }

    /**
     * Prueba el metodo dividir() de la clase Calculadora
     * Se espera que la división de 10 entre 2 sea 5
     */
    @Test
    void testDivision() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(10, 2);
        assertEquals(5, resultado, "La división de 10 entre 2 debería ser 5");
    }

    /**
     * Prueba la división por cero en el método dividir().
     * Se espera que lanzar una división entre 0 genere una excepción ArithmeticException.
     */
    @Test
    void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0),
                "La división por 0 debería lanzar una excepción");
    }
}
