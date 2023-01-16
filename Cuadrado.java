/* Este programa la potencia de cualquier número dado, la potencia también es asignada en la terminal
 * 
 */

public class Cuadrado{
    public static int cuad(int num, int c){  // Creación de la función cuad recursiva
        int resultado = 0;
        if (c==0){  // Caso base
            resultado = 1;
        }
        if (c == 1){ // Caso base
            resultado = num;
        }
        if (c > 1){ // Caso recursivo
            resultado = num * cuad(num, c -1);
        }

        return resultado;
    }    


    public static void main(String args[]){ // Se imprime el resultado con ayuda de la función cuad con los parámetros dados
        int n = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        System.out.println (cuad(n, a));
    } 

    
}