package calculadora;
import java.util.Scanner;

public class Calculadora {
   
   
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Cantidad de veces");
            int cantidad = Integer.parseInt(sc.nextLine());
            for(int i = 1; i <= cantidad; i++){
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
            }
        }
        catch (Exception e){
            System.out.println("ERROR: " + e);
        }
    }
}