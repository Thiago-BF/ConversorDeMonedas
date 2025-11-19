import java.util.Scanner;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println("************************************************************");
        System.out.println("**************      Conversor de Moneda      **************");
        System.out.println("************************************************************");
        System.out.println("1) Dólar  ==> Peso argentino");
        System.out.println("2) Peso argentino  ==> Dólar");
        System.out.println("3) Dólar  ==> Real brasileño");
        System.out.println("4) Real brasileño  ==> Dólar");
        System.out.println("5) Dólar  ==> Peso colombiano");
        System.out.println("6) Peso colombiano  ==> Dólar");
        System.out.println("7) Salir");
        System.out.print("Elija una opción válida: ");
    }

    public static int leerOpcion() {
        return scanner.nextInt();
    }

    public static double leerMonto() {
        System.out.print("Ingrese el monto a convertir: ");
        return scanner.nextDouble();
    }
}
