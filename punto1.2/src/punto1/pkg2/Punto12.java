
package punto1.pkg2;


public class Punto12 {

    public static void main(String[] args) {
        int numero = 1;
        while (numero<11){
        int resultado = factorial(numero);
        System.out.println("el factorial del numero "+ numero+" es "+resultado);
        numero += 1;
        }
        
    }
    public static int factorial(int i){
        int multiplicador = 1;
        int numero = 1;
        while(multiplicador < i){
            numero += numero * multiplicador;
            multiplicador +=1;
        }
    return numero;
    }
}
    

