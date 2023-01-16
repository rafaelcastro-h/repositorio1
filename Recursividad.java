
/* Este programa imprime el resultado de sumar todos los números anteriores a n número, en este caso
 * se utilizo el número 7
 */

public class Recursividad{

    public static int suma(int num){ // Se crea la función suma de forma recursiva
        int resultado = 0;
        if (num == 1){
            resultado = 1;
        }
        if (num > 1){
            resultado = num + suma(num-1);
        }
        return resultado;



    }
    public static void main(String args[]){ // Se imprime el resultado con ayuda de la función suma 
        System.out.println (suma(7));
        
    }
}