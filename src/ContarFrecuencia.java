import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarFrecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> palabras = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("ContarPalabras.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                /**
                 * Convierto todo en minusculas y "corto"
                 * por un espacio, una coma o un punto.
                 */
                String[] palabra = linea.toLowerCase().split("[ ,.]+");

                for (int i = 0; i < palabra.length; i++) {
                    if (palabras.containsKey(palabra[i])) { // si la palabra está en el map
                        palabras.put(palabra[i],palabras.get(palabra[i])+1); // sumo 1 a su valor
                    } else {
                        palabras.putIfAbsent(palabra[i],1); //si no está la añado y la doy de valor 1
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }


        for (Map.Entry<String, Integer> entry : palabras.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("La palaba " + "\033[4m" + entry.getKey() + "\033[0m" + " aparece " + entry.getValue() + " veces.");
            } else {
                System.out.println("La palaba " + "\033[4m" + entry.getKey() + "\033[0m"  + " aparece " + entry.getValue() + " vez.");
            }
            //"\033[4m subraya; 3m cursiva; 1m negrita
        }
    }
}
