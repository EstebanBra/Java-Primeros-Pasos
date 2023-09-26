import java.util.Scanner;

public class ia {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase or word, it must be maximum 25 characters:");
        String phrase;
        do {
            phrase = scanner.nextLine();
            if (phrase.length() > 25) {
                System.out.println("The phrase is very long, reenter.");
            }
        } while (phrase.length() > 25);

        scanner.close();

        char[][] matrix = new char[5][5];
        boolean[][] usedChars = new boolean[5][5]; // Nueva matriz para rastrear los caracteres usados
        fillMatrix(matrix, phrase, usedChars);
        showMatrix(matrix);

    }

    public static void fillMatrix(char[][] matrix, String phrase, boolean[][] usedChars) {
        int i = 0;

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (i < phrase.length()) {
                    char currentChar = phrase.charAt(i);

                    // Verifica si el carácter ya se ha utilizado en la matriz
                    if (!checkRepeatedCharacter(matrix, currentChar) && !usedChars[row][column]) {
                        matrix[row][column] = currentChar;
                        usedChars[row][column] = true;
                        i++;
                    } else {
                        // Puedes optar por ignorar el carácter repetido o realizar alguna otra acción aquí
                        i++; // Ignorar el carácter y avanzar al siguiente
                    }
                } else {
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

    public static boolean checkRepeatedCharacter(char[][] matrix, char character) {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (matrix[row][column] == character) {
                    return true; // Si se encuentra el carácter, está repetido
                }
            }
        }
        return false; // Si no se encuentra en la matriz, no está repetido
    }
}
