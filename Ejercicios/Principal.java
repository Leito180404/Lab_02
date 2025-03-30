package Ejercicios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de operación:");
        System.out.println("1. Enteros");
        System.out.println("2. Decimales");
        int opcionTipo = sc.nextInt();

        switch (opcionTipo) {

            case 1:
                System.out.println("Ingrese primer número entero:");
                int intNum1 = sc.nextInt();
                System.out.println("Ingrese segundo número entero:");
                int intNum2 = sc.nextInt();

                OperacionesMatInteger opEnteros = new OperacionesMatInteger(intNum1);

                System.out.println("Suma: " + opEnteros.suma(intNum2));
                System.out.println("Resta: " + opEnteros.resta(intNum2));
                System.out.println("Producto: " + opEnteros.producto(intNum2));
                try {
                    System.out.println("División: " + opEnteros.division(intNum2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                System.out.println("Ingrese primer número decimal:");
                double doubleNum1 = sc.nextDouble();
                System.out.println("Ingrese segundo número decimal:");
                double doubleNum2 = sc.nextDouble();

                OperacionesMatDouble opDecimales = new OperacionesMatDouble(doubleNum1);

                System.out.println("Suma: " + opDecimales.suma(doubleNum2));
                System.out.println("Resta: " + opDecimales.resta(doubleNum2));
                System.out.println("Producto: " + opDecimales.producto(doubleNum2));
                if (doubleNum2 != 0) {
                    System.out.println("División: " + opDecimales.division(doubleNum2));
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;

            default:
                System.out.println("Tipo de operación inválido.");
        }

        sc.close();
    }
}

