import java.io.*;
public class copiaFichero {
    public static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte []datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        } catch(Exception e ) {
            System.out.println("Excepcion " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        String fileIn = "/etc/passwd";
        String fileOut = "archivoSalida.txt";
        copiar(fileIn, fileOut);
    }

}
