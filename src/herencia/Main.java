package herencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial: $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuenta1 = new
                CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.print("Ingrese la cantidad que va a consignar");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignarDinero(cantidadDepositar);
        System.out.print("Ingresar la cantidad que desea retirar");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirarDinero(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
    }
}