import java.util.Vector;
public class vector {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();

        vector.add("elemento 1");
        vector.add("elemento 2");
        vector.add("elemento 3");
        vector.add("elemento 4");
        vector.add("elemento 5");

        // Mostrar los elementos del vector
        System.out.println("Elementos del vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // Eliminar el 2do y 3er elemento
        vector.remove(2);
        vector.remove(1);
        // Mostrar los elementos actualizados del vector
        System.out.println("Elementos actualizados del vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}


//    El problema de utilizar un Vector con la capacidad por defecto cuando se tienen que añadir
//    muchos elementos es que se puede producir un gran desperdicio de memoria y disminuir el
//    rendimiento del programa.
//    Cuando se crea un Vector sin especificar su capacidad inicial, su capacidad por defecto es de
//    10 elementos. Si intentas añadir más de 10 elementos al Vector, el Vector tendrá que
//    redimensionarse dinámicamente para aumentar su capacidad. Cada vez que se redimensiona el Vector,
//    se crea un nuevo arreglo con una capacidad mayor, se copian los elementos existentes al nuevo
//    arreglo y se descarta el arreglo anterior. Este proceso de redimensionamiento es costoso en
//    términos de rendimiento y puede causar un alto consumo de memoria.
//
//    En el caso en que se tengan que añadir 1000 elementos al Vector, sería más eficiente y tendría un
//    mejor rendimiento si se crea el Vector con una capacidad inicial de 1000 o más, para evitar que el
//    Vector tenga que redimensionarse constantemente a medida que se añaden elementos.
