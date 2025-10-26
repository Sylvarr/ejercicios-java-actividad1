/*
 * Pedir una nota de 0 a 10 y mostrarla de la forma:
 * Insuficiente (≤4), Suficiente (5), Bien (6),
 * Notable (7-8) y Sobresaliente (9-10).
 */

import java.util.Scanner;

public class ejercicio01Nota {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int nota;
    int jugar = 0;

    do {
      System.out.println();
      System.out.println("EVALUADOR DE NOTAS");
      System.out.println("------------------");

      do {
        System.out.print("Introduce una nota de 0 a 10: ");
        nota = sc.nextInt();

        if (nota < 0 || nota > 10) {
          System.out.println("Error: la nota debe estar entre 0 y 10.");
          System.out.println();
        }

      } while (nota < 0 || nota > 10);

      System.out.println();
      System.out.print("La nota es: ");

      if (nota <= 4) {
        System.out.println("Insuficiente.");
      } else if (nota == 5) {
        System.out.println("Suficiente.");
      } else if (nota == 6) {
        System.out.println("Bien.");
      } else if (nota >= 7 && nota <= 8) {
        System.out.println("Notable.");
      } else {
        System.out.println("Sobresaliente.");
      }

      System.out.println();
      System.out.println("¿Quieres evaluar otra nota?");
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