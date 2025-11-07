/*
 * Crea una matriz de 3X3 (3 filas y tres columnas) de números del 1 al 9. Y responder a las siguientes preguntas:
 * - Por cada fila de la matriz, muestra cada número, y al final de cada fila muestras la suma de sus números. Al final de la matriz,
 *   muestras la suma de todos los números.
 * - Contar cuántos elementos son pares e impares en la matriz.
 * - Encontrar el valor mayor y el menor dentro de la matriz.
 */

public class ejercicio05Matriz {

  public static void main(String[] args) {

    int[][] matriz = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int sumaTotal = 0, pares = 0, impares = 0, menor = matriz[0][0], mayor = matriz[0][0];

    System.out.println();
    System.out.println("ANALISIS DE MATRIZ 3x3");
    System.out.println("----------------------");
    System.out.println();

    for (int i = 0; i < matriz.length; i++) {

      int sumaFila = 0;

      System.out.print("Fila " + (i + 1) + ": ");

      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
        sumaFila += matriz[i][j];

        if (matriz[i][j] % 2 == 0) {
          pares++;
        } else {
          impares++;
        }

        if (matriz[i][j] > mayor) {
          mayor = matriz[i][j];
        } else if (matriz[i][j] < menor) {
          menor = matriz[i][j];
        }
      }

      System.out.println(" -- Suma: " + sumaFila);
      sumaTotal += sumaFila;
    }

    System.out.println();
    System.out.println("RESULTADOS");
    System.out.println("----------");
    System.out.println("Suma total de la matriz: " + sumaTotal);
    System.out.println("Numeros pares: " + pares);
    System.out.println("Numeros impares: " + impares);
    System.out.println("Numero menor: " + menor);
    System.out.println("Numero mayor: " + mayor);
    System.out.println();
  }
}
