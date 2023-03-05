import java.util.Scanner;

public class Ejercicio_2 {

/*Dado este codigo:
public static void main(String[] args) {
        int[][] tabla = new int[4][4];
        int val = 0;
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                tabla[j][i] = val;
                val++;
            }
        }
        int barco = (int) (Math.random() * 16);
        int columna = 0;
        int linea = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        while (contador < 16) {
            System.out.println("¿Qué columna?");
            columna = sc.nextInt();
            System.out.println("¿Qué línea?");
            linea = sc.nextInt();
            if (tabla[linea - 1][columna - 1] == barco) {
                System.out.println("Tocado y hundido");
                contador = 16;
            } else {
                System.out.println("Agua");
                contador++;
            }
        }
        if (contador == 16) {
            System.out.println("Ha ganado");
        }
        debe dividirlo en procedimientos y funciones haciedno los siguuientes requerimientos:

Escribir un procedimiento initializarTablero() que inicialice el tablero de juego.

Escribir un procedimiento mostrarTablero() que, como su nombre indica, muestre el tablero de juego.

Escribir una función introducirEnteroEntreLimites(), que hace que el usuario introduzca un valor hasta que esté entre un valor mínimo y un valor máximo, pasados en los argumentos de esta función.

Escribir una función de disparar() que le permita al jugador elegir sus coordenadas de disparo y devuelva verdadero si el barco es alcanzado y falso en caso contrario.

Escribir el algoritmo principal que llama a estos procedimientos y sus funciones*/

    public static int[][] tabla;
    public static int barco;
    public static int contador;

    public static void main(String[] args) {

        initializarTablero();
        mostrarTablero();
        while (contador < 16) {
            int columna = introducirEnteroEntreLimites("¿Qué columna?", 1, 4);
            int linea = introducirEnteroEntreLimites("¿Qué línea?", 1, 4);
            if (disparar(linea - 1, columna - 1)) {
                System.out.println("Tocado y hundido");
                break;
            } else {
                System.out.println("Agua");
                contador++;
            }
        }
        if (contador == 16) {
            System.out.println("Ha ganado");
        }
    }

    public static void initializarTablero() {
        tabla = new int[4][4];
        int val = 0;
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                tabla[j][i] = val;
                val++;
            }
        }
        barco = (int) (Math.random() * 16);
        contador = 0;
    }

    public static void mostrarTablero() {
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                System.out.print(tabla[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static int introducirEnteroEntreLimites(String mensaje, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.println(mensaje);
            valor = sc.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }

    public static boolean disparar(int linea, int columna) {
        if (tabla[linea][columna] == barco) {
            return true;
        } else {
            return false;
        }
    }




}
