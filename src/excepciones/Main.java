package excepciones;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculosNumericos calculos = new CalculosNumericos();

        // cálculo de la raíz cuadrada
        try {
            double raiz = CalculosNumericos.calcularRaizCuadrada(125);
            System.out.println("La raíz cuadrada de 125 es " + raiz);

            raiz = CalculosNumericos.calcularRaizCuadrada(-9);
            System.out.println("La raíz cuadrada de -9 es " + raiz);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // cálculo pendiente de recta
        try {
            double pendiente = calculos.calcularPendienteRecta(5, 2, 1, 6);
            System.out.println("La pendiente de la recta es " + pendiente);

            pendiente = calculos.calcularPendienteRecta(1, 1, 1, 4);
            System.out.println("La pendiente de la recta es: " + pendiente);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // cálculo punto medio
        try {
            Point2D.Double puntoMedio = calculos.calcularPuntoMedioRecta(6, 1, 3, 8);
            System.out.println("El punto medio de la recta es " + puntoMedio);
            puntoMedio = calculos.calcularPuntoMedioRecta(1, 1, 1, 1);
            System.out.println("El punto medio de la recta es " + puntoMedio);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }



        // cálculo reices ecuación cuadratica
        try {
            double[] raices = calculos.calculoRaicesEcuacionCuadratica(2, 2, -312);
            System.out.println("Las raíces de la ecuación son: " + "x1 = " + raices[0] + " y " + "x2 = " + raices[1]);
            raices = calculos.calculoRaicesEcuacionCuadratica(5, 2, 3);
            System.out.println("Las raíces de la ecuación son: " + "x1 = " + raices[0] + " y " + "x2 = " + raices[1]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // cálculo cambio de base
        try {
            int numero = 456;
            int base = 7;
            String resultado = calculos.cambiarBase(numero, base);
            System.out.println("El número " + numero + " en base " + base + " es: " + resultado);
            base = 1;
            resultado = calculos.cambiarBase(numero, base);
            System.out.println("El número " + numero + " en base " + base + " es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}