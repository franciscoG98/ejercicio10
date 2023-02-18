public class ReverseString {
    public static void main(String[] args) {

        String word = "Hola mundo";
        String reversedWord = "";

        for (int i = 0; i < word.length(); i++) {
            reversedWord = word.charAt(i) + reversedWord;
        }

        System.out.println("la palabra es: " + word);
        System.out.println("la palabra inversa es: " + reversedWord);
    }

}
