
package ejercicio3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String usuario = "admin";
        String contrasena = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String inputUsuario = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String inputContrasena = scanner.nextLine();

        if (inputUsuario.equals(usuario) && inputContrasena.equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Inicio de sesión fallido. Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}
