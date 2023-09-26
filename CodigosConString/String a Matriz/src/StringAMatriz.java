import java.util.Scanner;

public class StringAMatriz {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrese or word, it must be maximum 25 characters:");
        String phrase;
        do {
            phrase = scanner.nextLine();
            if (phrase.length() > 25) {
                System.out.println("The phrase in very long reentry");
            }
        } while (phrase.length() > 25);
        phrase = phrase.toUpperCase();
        phrase = phrase.replace(" ", "");
        scanner.close();

        char[][] matrix = new char[5][5];
        fillMatrix(matrix, phrase);
        showMatrix(matrix);

    }

    //Llenar matriz con la frase ingresada
    public static void fillMatrix(char[][] matrix, String phrase) {
        int i = 0;
        char currentChar;

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (i < phrase.length()) {
                    currentChar = phrase.charAt(i);
                    while(!checkRepeatedCharacter(matrix, currentChar)){
                        // Si el caracter se repite, avanzamos al siguiente caracter en la cadena.
                        i++;
                        if(i >= phrase.length()) {
                            break; // Evitar un desbordamiento si hemos llegado al final de la cadena.
                        }
                        currentChar = phrase.charAt(i);
                    }
                    matrix[row][column] = currentChar;
                    i++;
                } else {
                    // LLena los demas elementos con espacios
                    matrix[row][column] = ' ';
                }
            }
        }
    }

    public static void showMatrix(char[][] matrix) {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.print("[" + matrix[row][column] + "]");
            }
            System.out.println();
        }
    }
    // Verificar que el caracter no este repetido en la matriz
    public static boolean checkRepeatedCharacter(char[][] matrix, char character) {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (matrix[row][column] == character) {
                    return false;
                }
            }
        }
        return true;
    }
}
