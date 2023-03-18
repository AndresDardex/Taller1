package numero6;
import java.util.Scanner;

public class Numero6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            for(int i=1;i<=5;i++){
            int numero = Integer.parseInt(sc.nextLine());
            validarNumero objvalidarNumero = new validarNumero();
            objvalidarNumero.Validar(numero);
            }
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }    
}
