import java.io.*;
import java.util.*;

public class CountWords {

    public static void main(String[] args) {
        // Crea HashMap para almacenar las frecuencias de cada palabra
        Map<String, Integer> wordCounts = new HashMap<>();

        // Crea ArrayList para almacenar los nombres de archivo
        ArrayList<String> files = new ArrayList<>();

        // Crea LinkedList para almacenar las palabras encontradas
        LinkedList<String> words = new LinkedList<>();

        // Lee los nombres de archivo de entrada
        for (String arg : args) {
            files.add(arg);
        }

        // Procesa cada archivo de entrada
        for (String file : files) {
            try {
                // Abre el archivo de entrada y crea un BufferedReader
                FileInputStream fileStream = new FileInputStream(file);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));

                // Lee cada línea del archivo
                String line;
                while ((line = reader.readLine()) != null) {
                    // Divide la línea en palabras y las agrega a la LinkedList
                    String[] lineWords = line.split("\\s+");
                    for (String word : lineWords) {
                        words.add(word);
                    }
                }

                // Cuenta la frecuencia de cada palabra en la LinkedList
                for (String word : words) {
                    if (wordCounts.containsKey(word)) {
                        wordCounts.put(word, wordCounts.get(word) + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }

                // Cierra el archivo de entrada y el BufferedReader
                reader.close();
                fileStream.close();

            } catch (FileNotFoundException e) {
                // Maneja el error si el archivo no se encuentra
                System.err.println("Archivo no encontrado: " + file);

            } catch (IOException e) {
                // Maneja el error si no se puede leer el archivo
                System.err.println("Error de lectura: " + file);
            }
        }

        // Imprime la frecuencia de cada palabra
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
