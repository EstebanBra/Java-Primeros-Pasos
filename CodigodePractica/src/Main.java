import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declarar Variables
        int edad = 20;
        float clima = 19.5f;
        char letra = 'a';
        String nombre = "Esteban Bravo";

        // Se puede usar "var" para declarar cualquier tipo de variable
        var letra2 = 'a';
        var edad2 = 30;
        var nombre2 = "Patricio Suarez";

        // Mostrar Variables

        System.out.println("Persona 1\n");
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(letra);
        System.out.println(clima);

        System.out.println("\nPersona 2\n");
        System.out.println(nombre2);
        System.out.println(edad2);
        System.out.println(letra2);

        //Comparar Cadenas

        nombre.equals(nombre2);

        // Actualizar datos numericos

        int salario = 1000;
        salario = salario + 500;
        System.out.println("\n" + salario);

        // Actualizar variables de tipo String
        String nombres = "Esteban";
        nombres = nombres + " Patricio";
        System.out.println("\n");
        System.out.println(nombres);

        // Scanner leer dato por teclado, importante : importar java.util.Scanner
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un usuario:");
        var usuarioIngresado = scanner.nextLine();
        System.out.println("\nIngrese su edad");
        int numIngresado = scanner.nextInt();

        System.out.println("Nombre Usuario: " + usuarioIngresado + "\nEdad del usuario: " + numIngresado);

        

        // Incremento postfijo

        int vidas = 5, regalos = 100;
        regalos += vidas++;
        System.out.println("\nregalos =" + regalos + "\t\tvidas =" + vidas); // regalos= 105 y vidas= 6

        // Incremento postfijo
        int vida = 5, regalo = 100;
        regalo += ++vida;
        System.out.println("\nregalo =" + regalo + "\t\tvida =" + vida); // regalo = 106 y vida= 6

        // Operaciones matematicas
        double x = 2.1;
        double y = 3;

        // Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        // Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        // Devuelve un número elevado a otro
        System.out.println(Math.pow(x, y));

        // Devuelve el numero mayor
        System.out.println(Math.max(x, y));

        // Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        // Estructura switch
        int nota = 7;

        switch (nota) {
            case 1:
                System.out.println("\nReprobado");
                break;
            case 4:
                System.out.println("\nAprobado");
                break;
            case 7:
                System.out.println("\nSobresaliente");
                break;
        }


        scanner.close();
    }
}