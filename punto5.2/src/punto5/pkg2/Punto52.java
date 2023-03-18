
package punto5.pkg2;

import java.util.Scanner;


public class Punto52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int i = 1;
            while (i<=6){
                double numero= Double.parseDouble(sc.nextLine());
                validarNumero objValidarNumero = new validarNumero();
                objValidarNumero.validar(numero);
                i+=1;
            }
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
    
}
