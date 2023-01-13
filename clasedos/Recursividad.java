// Documentar

public class Recursividad{

    public static int suma(int num){
        int resultado = 0;
        if (num == 1){
            resultado = 1;
        }
        if (num > 1){
            resultado = num + suma(num-1);
        }
        return resultado;



    }
    public static void main(String args[]){
        System.out.println (suma(7));
        
    }
}