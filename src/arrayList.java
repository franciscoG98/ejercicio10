import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class arrayList {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("elemento1");
        arrayList.add("elemento2");
        arrayList.add("elemento3");
        arrayList.add("elemento4");

        // Crear una LinkedList a partir del ArrayList
        List<String> linkedList = new LinkedList<String>(arrayList);

        // Recorrer el ArrayList y mostrar los valores de cada elemento
        System.out.println("Elementos del ArrayList:");
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }

        // Recorrer la LinkedList y mostrar los valores de cada elemento
        System.out.println("Elementos de la LinkedList:");
        for (String elemento : linkedList) {
            System.out.println(elemento);
        }

    }

}
