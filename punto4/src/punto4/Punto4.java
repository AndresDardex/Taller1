
package punto4;
import java.util.Scanner;

public class Punto4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            for (int i = 1; i<=4; i++){
                long numero = Long.parseLong(sc.nextLine());
                elevacionesxd objElevacionesxd = new elevacionesxd();
                objElevacionesxd.elevar(numero);
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    
}
