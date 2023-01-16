/* Este programa imprime el factorial de cualquier número que de el usuario en la terminal
 */

public class Factorial{ 
    public static int fact(int num){ // Creación de la función recursiva para obtener el factorial del número 

        int resultado = 0;
        if (num==1){  // Caso base 
            resultado = 1;
        }
        if (num > 1){ // Caso recursivo
            resultado = num * fact(num-1);
        }

        return resultado;

    }

    public static void main(String args[]){ // Se imprime el resultado con ayuda de la función fact
        int n = Integer.parseInt(args[0]);
        System.out.println (fact(n));
    } 
    
}    