import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        File f = new File("data.csv");
        if (!f.exists()) {
            System.err.println("No se encontró data.csv en el directorio actual: " + System.getProperty("user.dir"));
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line = br.readLine(); // cabecera
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String nombre;
                String codigo;
                if (line.startsWith("\"")) {
                    int i = line.lastIndexOf("\",");
                    if (i != -1) {
                        nombre = line.substring(1, i);
                        codigo = line.substring(i + 2).trim();
                    } else {
                        int idx = line.lastIndexOf(',');
                        nombre = line.substring(0, idx).replaceAll("\"", "");
                        codigo = line.substring(idx + 1).trim();
                    }
                } else {
                    int idx = line.lastIndexOf(',');
                    nombre = line.substring(0, idx).trim();
                    codigo = line.substring(idx + 1).trim();
                }
                paises.add(new Pais(nombre, codigo));
            }
        } catch (IOException e) {
            System.err.println("Error leyendo data.csv: " + e.getMessage());
            return;
        }

        if (paises.isEmpty()) {
            System.err.println("No se cargaron países desde data.csv");
            return;
        }

        Scanner sc = new Scanner(System.in, "UTF-8");
        Random rnd = new Random();
        Pais elegido = paises.get(rnd.nextInt(paises.size()));
        String nombre = elegido.getNombre();
        char primera = nombre.trim().charAt(0);

        System.out.println("=== Juego: Adivina el país ===");
        System.out.println("Pista: la primera letra es: " + primera);
        System.out.print("Tu respuesta: ");
        String respuesta = sc.nextLine();

        if (normalize(respuesta).equals(normalize(nombre))) {
            System.out.println("¡Correcto! Era: " + nombre + " (" + elegido.getCodigo() + ")");
        } else {
            System.out.println("No es correcto. El país era: " + nombre + " (" + elegido.getCodigo() + ")");
        }

        sc.close();
    }

    private static String normalize(String s) {
        if (s == null) return "";
        String n = Normalizer.normalize(s, Normalizer.Form.NFD);
        n = n.replaceAll("\\p{M}", "");
        return n.toLowerCase(Locale.ROOT).trim();
    }
}
