/*
 * Realizar un juego para adivinar un número. Para ello pedir un número N aleatorio de 1 a 40, y luego ir pidiendo números indicando
 * "mayor" o "menor" según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta. Y escribimos la cantidad de
 * intentos antes del número exacto.
 */

import java.util.Scanner;

public class ejercicio04Adivina {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int jugar = 0;

    do {
      int numeroAleatorio = (int) (Math.random() * 40 + 1);

      System.out.println();
      System.out.println("JUEGO: ADIVINA EL NUMERO (1-40)");
      System.out.println("-------------------------------");

      System.out.print("Adivina el numero: ");
      int numero = sc.nextInt();
      int intentos = 0;
      boolean acierto = false;

      if (numero >= 1 && numero <= 40) {
        do {
          intentos++;

          if (numero > numeroAleatorio) {
            System.out.println("El numero es menor.");
            System.out.print("Adivina el numero: ");
            numero = sc.nextInt();
          } else if (numero < numeroAleatorio) {
            System.out.println("El numero es mayor.");
            System.out.print("Adivina el numero: ");
            numero = sc.nextInt();
          } else if (numero == numeroAleatorio) {
            System.out.println();
            System.out.println("Has acertado!");
            System.out.println("Lo has conseguido en " + intentos + " intentos.");
            acierto = true;
          }

        } while (!acierto);
      } else {
        System.out.println("Por favor introduce un numero entre 1 y 40.");
      }

      System.out.println();
      System.out.println("¿Quieres jugar otra partida?");
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
