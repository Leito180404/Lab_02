package Ejercicios;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de operacion:");
        System.out.println("1. Operaciones con Enteros");
        System.out.println("2. Operaciones con Decimales");
        int opcionTipo = sc.nextInt();

        switch (opcionTipo) {

            case 1:
                System.out.println("Ingrese el primer numero entero:");
                Integer numEntero1 = sc.nextInt();

                System.out.println("Ingrese el segundo numero entero:");
                Integer numEntero2 = sc.nextInt();

                OperacionesMatInteger<Integer> opEntero = new OperacionesMatInteger<>(numEntero1, Integer.class);

                System.out.println("Ingrese la operacion (1:suma, 2:resta, 3:producto, 4:division):");
                int operacionEntero = sc.nextInt();

                switch (operacionEntero) {
                    case 1:
                        System.out.println("Suma: " + opEntero.suma(numEntero2));
                        break;
                    case 2:
                        System.out.println("Resta: " + opEntero.resta(numEntero2));
                        break;
                    case 3:
                        System.out.println("Producto: " + opEntero.producto(numEntero2));
                        break;
                    case 4:
                        try {
                            System.out.println("Division: " + opEntero.division(numEntero2));
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Operacion invalida.");
                }
                break;

            case 2:
                System.out.println("Ingrese el primer numero decimal:");
                Double numDouble1 = sc.nextDouble();

                System.out.println("Ingrese el segundo numero decimal:");
                Double numDouble2 = sc.nextDouble();

                OperacionesMatDouble<Double> opDouble = new OperacionesMatDouble<>(numDouble1, Double.class);

                System.out.println("Ingrese la operacion (1:suma, 2:resta, 3:producto, 4:division):");
                int operacionDouble = sc.nextInt();

                switch (operacionDouble) {
                    case 1:
                        System.out.println("Suma: " + opDouble.suma(numDouble2));
                        break;
                    case 2:
                        System.out.println("Resta: " + opDouble.resta(numDouble2));
                        break;
                    case 3:
                        System.out.println("Producto: " + opDouble.producto(numDouble2));
                        break;
                    case 4:
                        if (numDouble2 != 0) {
                            System.out.println("Division: " + opDouble.division(numDouble2));
                        } else {
                            System.out.println("No se puede dividir por cero.");
                        }
                        break;
                    default:
                        System.out.println("Operacion invalida.");
                }
                break;

            default:
                System.out.println("Tipo de operacion invalido.");
        }

        sc.close();
    }
}
