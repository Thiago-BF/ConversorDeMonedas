public class CurrencyConverter {

    public static double convertir(String base, String objetivo, double monto) {
        double tasa = ApiClient.obtenerTasa(base, objetivo);

        if (tasa == -1) {
            System.out.println("No se pudo obtener la tasa de conversión.");
            return -1;
        }

        return monto * tasa;
    }
}
