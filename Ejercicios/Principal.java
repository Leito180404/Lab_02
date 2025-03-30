package Ejercicios;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú de Operaciones Clases Genericas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz Cuadrada");
            System.out.println("7. Raiz Cubica");
            System.out.println("8. Salir");
            opcion = sc.nextInt();

            if (opcion == 8) break;

            System.out.println("Ingrese el tipo de dato: 1. Enteros 2. Decimales");
            int tipo = sc.nextInt();

            if (tipo == 1) {
                System.out.println("Ingrese primer numero entero:");
                int intNum1 = sc.nextInt();
                OperacionesMatInteger opInt = new OperacionesMatInteger(intNum1);

                if(opcion >= 1 && opcion <= 4){
                    System.out.println("Ingrese segundo numero entero:");
                    int intNum2 = sc.nextInt();
                    switch(opcion){
                        case 1: System.out.println("Suma: " + opInt.suma(intNum2)); break;
                        case 2: System.out.println("Resta: " + opInt.resta(intNum2)); break;
                        case 3: System.out.println("Producto: " + opInt.producto(intNum2)); break;
                        case 4: 
                            try {
                                System.out.println("Division: " + opInt.division(intNum2));
                            } catch (ArithmeticException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }
                }else{
                    switch(opcion){
                        case 5: System.out.println("Potencia: " + (int)Math.pow(intNum1,2)); break;
                        case 6: System.out.println("Raiz Cuadrada: " + Math.sqrt(intNum1)); break;
                        case 7: System.out.println("Raiz Cubica: " + Math.cbrt(intNum1)); break;
                    }
                }
            } else if (tipo == 2) {
                System.out.println("Ingrese primer numero decimal:");
                double doubleNum1 = sc.nextDouble();
                OperacionesMatDouble opDouble = new OperacionesMatDouble(doubleNum1);

                if(opcion >= 1 && opcion <= 4){
                    System.out.println("Ingrese segundo numero decimal:");
                    double doubleNum2 = sc.nextDouble();
                    switch(opcion){
                        case 1: System.out.println("Suma: " + opDouble.suma(doubleNum2)); break;
                        case 2: System.out.println("Resta: " + opDouble.resta(doubleNum2)); break;
                        case 3: System.out.println("Producto: " + opDouble.producto(doubleNum2)); break;
                        case 4: 
                            if(doubleNum2 != 0) 
                                System.out.println("Division: " + opDouble.division(doubleNum2));
                            else
                                System.out.println("No se puede dividir por cero.");
                            break;
                    }
                }else{
                    switch(opcion){
                        case 5: System.out.println("Potencia: " + Math.pow(doubleNum1,2)); break;
                        case 6: System.out.println("Raiz Cuadrada: " + Math.sqrt(doubleNum1)); break;
                        case 7: System.out.println("Raiz Cubica: " + Math.cbrt(doubleNum1)); break;
                    }
                }
            } else {
                System.out.println("Tipo de dato invalido.");
            }

        } while (true);

        sc.close();
    }
}

