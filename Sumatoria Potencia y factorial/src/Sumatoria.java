import java.util.Scanner;

public class Sumatoria {
    
    // Funcion Factorial
    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }



    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese una numero par: ");
        int n;
        do{
            n = scanner.nextInt();
            if (n%2 != 0) {
                System.out.println("Error: Reingrese un numero par");
            }
        }while(n % 2 != 0);

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                suma += Math.pow((i + (i - 1)) , i);
            } else {
                suma += factorial(i * (i - 1));
            }
        }

        System.out.println("El resultado de la suma es:" + suma);

        scanner.close();
    }

}
