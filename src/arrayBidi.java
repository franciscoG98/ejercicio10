public class arrayBidi {
    public static void main(String[] args) {

        int arrayBidi[][] = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("El elemento en la posición [" + i + "][" + j + "] es: " + arrayBidi[i][j]);
            }
        }

    }
}
