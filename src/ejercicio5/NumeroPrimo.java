package ejercicio5;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            
            if (numero <= 1) {
                System.out.println("El número no es primo.");
            } else {
                boolean esPrimo = true;
                int limite = (int) Math.sqrt(numero);
                
                for (int i = 2; i <= limite; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                
                if (esPrimo) {
                    System.out.println("El número es primo.");
                } else {
                    System.out.println("El número no es primo.");
                }
            }
        }
    }
}
