
package ejercicio4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoProductos {
    public static void main(String[] args) {
        List<String> productos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    scanner.nextLine(); // Consumir la nueva línea después de nextInt()
                    String nombreProducto = scanner.nextLine();
                    productos.add(nombreProducto);
                    System.out.println("Producto agregado exitosamente.");
                    break;
                case 2:
                    System.out.println("Listado de productos:");
                    for (String producto : productos) {
                        System.out.println(producto);
                    }
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

