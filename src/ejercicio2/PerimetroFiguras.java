
package ejercicio2;

import java.util.Scanner;

public class PerimetroFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una figura:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Triángulo equilátero");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    double perimetroCuadrado = 4 * ladoCuadrado;
                    System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
                    break;
                case 2:
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double anchoRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    double perimetroRectangulo = 2 * (anchoRectangulo + alturaRectangulo);
                    System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
                    break;
                case 3:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    double perimetroCirculo = 2 * Math.PI * radioCirculo;
                    System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                    break;
                case 4:
                    System.out.print("Ingrese el lado del triángulo equilátero: ");
                    double ladoTriangulo = scanner.nextDouble();
                    double perimetroTriangulo = 3 * ladoTriangulo;
                    System.out.println("El perímetro del triángulo equilátero es: " + perimetroTriangulo);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}
