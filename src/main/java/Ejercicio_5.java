public class Ejercicio_5 {
    /*Escribir un algoritmo para hacer dibujos en arte ASCII. El diseño está modelizado por una tabla de caracteres de diez líneas y cuarenta columnas. Inicialmente, esta tabla contiene solo caracteres de espacio. Un procedimiento debe llevar a cabo la visualización de la obra.

Cuando se inicia el programa, se muestra el dibujo y, a continuación, un menú ofrece realizar una de las siguientes funciones:

Dibujar un carácter.

Dibujar un rectángulo con un conjunto de caracteres.

Cambiar "el color" (es decir, el carácter), usando un bote de pintura (puede inspirarse en lo que se presentó en la sección que trata sobre la recursividad).

Cada una de las funciones mencionadas se debe realizar utilizando uno o más procedimientos.

*/
    public static void main(String[] args) {
        char[][] tabla = new char[10][40];
        inicializarTabla(tabla);
        mostrarTabla(tabla);
        dibujarCaracter(tabla, 'a', 1, 1);
        mostrarTabla(tabla);
        dibujarRectangulo(tabla, 'b', 2, 2, 4, 4);
        mostrarTabla(tabla);
        cambiarColor(tabla, 'c', 3, 3);
        mostrarTabla(tabla);
    }

    public static void inicializarTabla(char[][] tabla){
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                tabla[i][j] = ' ';
            }
        }
    }

    public static void mostrarTabla(char[][] tabla){
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                System.out.print(tabla[i][j]);
            }
            System.out.println();
        }
    }

    public static void dibujarCaracter(char[][] tabla, char caracter, int linea, int columna){
        tabla[linea][columna] = caracter;
    }

    public static void dibujarRectangulo(char[][] tabla, char caracter, int linea, int columna, int ancho, int alto){
        for(int i = linea; i < linea + alto; i++){
            for(int j = columna; j < columna + ancho; j++){
                tabla[i][j] = caracter;
            }
        }
    }

    public static void cambiarColor(char[][] tabla, char caracter, int linea, int columna){
        char color = tabla[linea][columna];
        if(color != caracter){
            tabla[linea][columna] = caracter;
            if(linea > 0){
                cambiarColor(tabla, caracter, linea - 1, columna);
            }
            if(linea < tabla.length - 1){
                cambiarColor(tabla, caracter, linea + 1, columna);
            }
            if(columna > 0){
                cambiarColor(tabla, caracter, linea, columna - 1);
            }
            if(columna < tabla[linea].length - 1){
                cambiarColor(tabla, caracter, linea, columna + 1);
}
        }
    }
}
