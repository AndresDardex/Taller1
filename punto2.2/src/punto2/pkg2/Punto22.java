
package punto2.pkg2;

import java.util.Scanner;

public class Punto22 {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Cantidad de veces");
            int cantidad = Integer.parseInt(sc.nextLine());
            int i = 1;
            while(i <= cantidad){
            System.out.println("primer numero");
            int numero1 = Integer.parseInt(sc.nextLine());
            System.out.println("segundo numero");
            int numero2 = Integer.parseInt(sc.nextLine());
            System.out.println("tercer numero");
            int numero3 = Integer.parseInt(sc.nextLine());
            System.out.println("operador (+,-,/,*,%)");
            String signo = sc.nextLine();
            operaciones objOperaciones = new operaciones();
            objOperaciones.operaciones(numero1, numero2, numero3, signo);
            i+=1;
            }
        }
        catch (Exception e){
            System.out.println("ERROR: " + e);
        }
    }
    
}
