public class Ejercicio_3 {
    /*Escriba una función que cree una tabla que tenga una dimensión de diez números enteros e inicialice aleatoriamente los valores de esta tabla, con valores entre un límite mínimo y un límite máximo, que se pasan como argumentos.

Cree una función que devuelva el mayor valor de una tabla (esta tabla no tiene necesariamente diez celdas, etc.).

Escriba un algoritmo que llame a estas dos funciones.*/

    public static void main(String[] args) {
        int[] tabla = new int[10];
        int min = 1;
        int max = 10;
        inicializarTabla(tabla, min, max);
        System.out.println("El mayor valor de la tabla es: " + mayorValor(tabla));
    }

    public static void inicializarTabla(int[] tabla, int min, int max){
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    public static int mayorValor(int[] tabla){
        int mayor = tabla[0];
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] > mayor){
                mayor = tabla[i];
            }
        }
        return mayor;
    }
}
