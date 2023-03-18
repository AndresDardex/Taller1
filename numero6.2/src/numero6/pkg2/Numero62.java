
package numero6.pkg2;

import java.util.Scanner;


public class Numero62 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int i = 1;
            while(i<=5){
                int numero = Integer.parseInt(sc.nextLine());
                validarNumero objvalidarNumero = new validarNumero();
                objvalidarNumero.Validar(numero);
                i+=1;
            }
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
    
}
