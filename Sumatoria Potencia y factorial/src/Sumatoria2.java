import java.util.Scanner;

public class Sumatoria2 {

    // Funcion Factorial
    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float suma = 0;
        int par = 2;
        System.out.println("Ingrese una numero par: ");
        int n ;
        do {
            n = scanner.nextInt();
            if (n % 2 != 0) {
                System.out.println("Error: Reingrese un numero par");
            }
        } while (n % 2 != 0);

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                suma += ((i + factorial(i-1))/(float)par);
            }else {   
                suma -= Math.pow((i + (i + 1))/(float)par, i);
                par += 2;
            }
        }
        System.out.println("La Suma es: " + suma);
        scanner.close();
    }
}
