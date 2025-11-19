public class Main {

    public static void main(String[] args) {

        while (true) {
            Menu.mostrarMenu();
            int opcion = Menu.leerOpcion();

            if (opcion == 7) {
                System.out.println("Saliendo...");
                break;
            }

            double monto = Menu.leerMonto();
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = CurrencyConverter.convertir("USD", "ARS", monto);
                    break;
                case 2:
                    resultado = CurrencyConverter.convertir("ARS", "USD", monto);
                    break;
                case 3:
                    resultado = CurrencyConverter.convertir("USD", "BRL", monto);
                    break;
                case 4:
                    resultado = CurrencyConverter.convertir("BRL", "USD", monto);
                    break;
                case 5:
                    resultado = CurrencyConverter.convertir("USD", "COP", monto);
                    break;
                case 6:
                    resultado = CurrencyConverter.convertir("COP", "USD", monto);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            if (resultado != -1) {
                System.out.println("Resultado: " + resultado);
            }
        }
    }
}
