public class dividePorCero {
    public static void main(String[] args) {
        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }

    public static void DividePorCero() throws ArithmeticException {
        int a = 10;
        int b = 0;
        int resultado = a / b;
    }

}
