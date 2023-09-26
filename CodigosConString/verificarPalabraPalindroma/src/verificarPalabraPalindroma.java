import java.util.Scanner;

public class verificarPalabraPalindroma {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program checks if the entered word is palindroma\n\n");
        System.out.println("Please enter a word: ");
        String word = scanner.next(); //next lee hazta que encuentra un salto de linea, osea solo una palabra
        

        scanner.close();

        if(isPalindroma(word)){
            System.out.println("In effect, the word entered is palindroma");
        }else {
            System.out.println("Sorry, the word entered is not palindroma");
        }

    }

    public static boolean isPalindroma(String word){
        // Convertir la palabra a Mayusculas 
        word = word.toUpperCase();
        int sizeWord = word.length();

        for(int i=0; i<(sizeWord/2); i++){
            if(word.charAt(i) != word.charAt(sizeWord-1-i)){
                return false;
            }
        }
        return true;
    }
}
