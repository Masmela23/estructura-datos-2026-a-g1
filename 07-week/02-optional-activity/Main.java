/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the vector: ");
        int count = scanner.nextInt();

        double[] vectorA = new double[count];
        double[] vectorB = new double[count];
        double[] vectorC = new double[count];

        // Llenar vector A
        for (int i = 0; i < count; i++) {
            vectorA[i] = i + 1;
        }

        // Llenar vector B
        for (int i = 0; i < count; i++) {
            vectorB[i] = vectorA[i] * 2;
        }

        // Llenar vector C (RESTA)
        for (int i = 0; i < count; i++) {
            vectorC[i] = vectorA[i] - vectorB[i];
        }

        // Imprimir vectores
        System.out.println("\nVector A:");
        for (int i = 0; i < count; i++) {
            System.out.print(vectorA[i] + " ");
        }

        System.out.println("\nVector B:");
        for (int i = 0; i < count; i++) {
            System.out.print(vectorB[i] + " ");
        }

        System.out.println("\nVector C (A - B):");
        for (int i = 0; i < count; i++) {
            System.out.print(vectorC[i] + " ");
        }

        scanner.close();
    }
}