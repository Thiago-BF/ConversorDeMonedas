import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClient {

    private static final String API_KEY = "dccc895714bbd1fe5ed4bbdd"; // tu key

    public static double obtenerTasa(String base, String objetivo) {
        String urlString = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + base;

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close();

            // Buscamos la tasa dentro del JSON (sin librerías externas)
            String json = response.toString();
            String key = "\"" + objetivo + "\":";
            int index = json.indexOf(key);

            if (index != -1) {
                int start = index + key.length();
                int end = json.indexOf(",", start);
                if (end == -1) {
                    end = json.indexOf("}", start);
                }
                return Double.parseDouble(json.substring(start, end));
            }

        } catch (Exception e) {
            System.out.println("Error al consultar la API: " + e.getMessage());
        }

        return -1;
    }
}
