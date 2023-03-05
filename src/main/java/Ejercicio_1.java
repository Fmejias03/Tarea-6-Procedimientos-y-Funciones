public class Ejercicio_1 {
    /*Escriba una función que tome dos valores reales como argumentos y devuelva el mayor de los dos.

Escriba otra función que también tome dos valores reales como argumentos, pero que devuelva:

0 si los dos valores son iguales;

1 si el primer valor es el mayor;

el texto -1 en caso contrario.

Escribir un algoritmo principal que llame a estas dos funciones.*/

    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 5;
        System.out.println("El mayor de los dos números es: " + mayor(num1, num2));
        System.out.println("El mayor de los dos números es: " + mayor2(num1, num2));
    }

    public static double mayor(double num1, double num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static double mayor2(double num1, double num2){
        if(num1 > num2){
            return 1;
        }else if(num1 == num2){
            return 0;
        }else{
            return -1;
        }
    }
}
