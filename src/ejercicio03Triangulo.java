/*
 * Para que tres números enteros den un triángulo válido, se tiene que dar la circunstancia de que 
 * la suma de dos cualquiera de los lados sea mayor que el del otro, en todas las combinaciones posibles.
 * Por tanto, el ejercicio consta de:
 * - Pedir tres números por consola, e informar si el triángulo es correcto, o no es correcto.
 * - Y si es correcto además decir si es:
 *   Equilátero: los tres lados iguales.
 *   Isósceles: dos iguales y uno desigual
 *   Escaleno: los tres lados distintos
 */

import java.util.Scanner;

public class ejercicio03Triangulo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int jugar = 0;
    boolean triangulo = false;

    do {
      System.out.println();
      System.out.println("VALIDADOR DE TRIANGULOS");
      System.out.println("-----------------------");

      System.out.print("Dame lado 1: ");
      int a = sc.nextInt();
      System.out.print("Dame lado 2: ");
      int b = sc.nextInt();
      System.out.print("Dame lado 3: ");
      int c = sc.nextInt();

      System.out.println();

      if (a + b > c && a + c > b && b + c > a) {
        System.out.println("El triangulo es correcto.");
        triangulo = true;
      } else {
        System.out.println("El triangulo no es correcto.");
        triangulo = false;
      }

      if (triangulo == true) {
        System.out.println();

        if (a == b && a == c) {
          System.out.println("Su tipo es: Equilatero");
        } else if (a == b || a == c || b == c) {
          System.out.println("Su tipo es: Isosceles");
        } else {
          System.out.println("Su tipo es: Escaleno");
        }
      }

      System.out.println();
      System.out.println("¿Quieres validar otro triangulo?");
      System.out.println("1. Si");
      System.out.println("2. No");
      System.out.print("Elige una opcion: ");
      jugar = sc.nextInt();

    } while (jugar == 1);

    System.out.println();
    System.out.println("Programa finalizado.");

    sc.close();
  }
}
