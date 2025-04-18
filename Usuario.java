import java.util.Scanner;

public class Usuario {

    public static void Usuario (String[]args) {
        System.out.println("Bienvenido a la App Bancaria");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite su nombre de usuario");
        String Usuario = scanner.nextLine();
        System.out.println("Hola " + Usuario + ", gracias por iniciar sesión.");
        
    }
}
