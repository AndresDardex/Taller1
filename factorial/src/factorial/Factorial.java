package factorial;


public class Factorial {

    public static void main(String[] args) {
        try{
            for (int numero1 = 1; numero1 < 11; numero1++){
            int resultado = factorial(numero1);
            System.out.println("el factorial del numero "+ numero1+" es "+resultado);
            }
        }
        catch(Exception e){
            System.out.println("ERROR: " + e);
        }
        
    }
    public static int factorial(int i){
        int numero = 1;
        for(int numeros = 1;numeros < i; numeros++){
            numero += numero * numeros;
        }
    return numero;
    }
    
}
