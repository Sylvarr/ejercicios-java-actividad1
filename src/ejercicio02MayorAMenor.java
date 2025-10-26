/*
 * Leer tres números enteros de la consola y mostrarlos ordenados de mayor a menor.
 */

import java.util.Scanner;

public class ejercicio02MayorAMenor {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int jugar = 0;

    do {
      System.out.println();
      System.out.println("ORDENAR 3 NUMEROS (mayor a menor)");
      System.out.println("----------------------------------");

      System.out.print("Introduce el primer numero: ");
      int a = sc.nextInt();
      System.out.print("Introduce el segundo numero: ");
      int b = sc.nextInt();
      System.out.print("Introduce el tercer numero: ");
      int c = sc.nextInt();

      int mayor = 0;
      int medio = 0;
      int menor = 0;

      if (a >= b && a >= c) {
        mayor = a;
        if (b >= c) {
          medio = b;
          menor = c;
        } else {
          medio = c;
          menor = b;
        }
      } else if (b >= a && b >= c) {
        mayor = b;
        if (a >= c) {
          medio = a;
          menor = c;
        } else {
          medio = c;
          menor = a;
        }
      } else {
        mayor = c;
        if (a >= b) {
          medio = a;
          menor = b;
        } else {
          medio = b;
          menor = a;
        }
      }

      System.out.println();
      System.out.println("Resultado ordenado de mayor a menor:");
      System.out.println(mayor + ", " + medio + ", " + menor);

      System.out.println();
      System.out.println("¿Quieres ordenar otros numeros?");
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