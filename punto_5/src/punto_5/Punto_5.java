
package punto_5;
import java.util.Scanner;


public class Punto_5 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            for (int i=1;i<=6;i++){
                double numero= Double.parseDouble(sc.nextLine());
                validarNumero objValidarNumero = new validarNumero();
                objValidarNumero.validar(numero);
            }
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
    
}
