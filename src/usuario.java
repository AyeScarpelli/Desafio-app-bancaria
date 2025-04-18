import java.util.Scanner;

    public class usuario {

        public static void main(String[] args) {
            System.out.println("\nBienvenido a la App Bancaria");

            String nombre = "Hugo John";
            String tipoDeCuenta = "Corriente";
            double saldoDisponible = 2000;
            int opcion = 0;

            System.out.println("\n*******************");
            System.out.println("\nNombre del cliente: " + nombre);
            System.out.println("Tipo de cuenta: " + tipoDeCuenta);
            System.out.println("Saldo disponible: $" + saldoDisponible);

            String menuDeOpciones = """
                    \n*** Escriba la accion que desea realizar ***
                    1 - Consultar Saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """;

            Scanner teclado = new Scanner(System.in);
            while (opcion != 9) {
                System.out.println(menuDeOpciones);
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Tu saldo actual es. $" + saldoDisponible);
                        break;
                    case 2:
                        System.out.println("¿Cúal es el monto que desea retirar?");
                        double valorARetirar = teclado.nextDouble();
                        if (saldoDisponible < valorARetirar) {
                            System.out.println("Su saldo es insuficiente, intente nuevamente");
                        } else {
                            saldoDisponible = saldoDisponible - valorARetirar;
                            System.out.println("Su saldo actualizado es: $" + saldoDisponible);
                        }
                        break;

                    case 3:
                        System.out.println("¿Que valor desea depositar?");
                        double deposito = teclado.nextDouble();
                        saldoDisponible = saldoDisponible + deposito;
                        System.out.println("Su saldo actualizado es: $" + saldoDisponible);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa, gracias por utilizar el Servicio de App Bancaria");
                        break;
                    default:
                        System.out.println("Opcion no válida");

                }
            }


        }
    }