
package punto4.pkg2;

import java.util.Scanner;

public class Punto42 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int i=1;
            while (i<=4){
                long numero = Long.parseLong(sc.nextLine());
                elevacionesxd objElevacionesxd = new elevacionesxd();
                objElevacionesxd.elevar(numero);
                i+=1;
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
    
}
