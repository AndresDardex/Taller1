
package punto3.pkg1;

import java.util.Scanner;


public class Punto31 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("cantidad de operaciones");
            int cantidad = Integer.parseInt(sc.nextLine());
            int i = 1;
            while(i <= cantidad){
                System.out.println("operador (OR, AND, XOR)");
                String operacion = sc.nextLine();
                System.out.println("valor booleano 1");
                boolean valor1 = Boolean.parseBoolean(sc.nextLine());
                System.out.println("valor booleano 2");
                boolean valor2 = Boolean.parseBoolean(sc.nextLine());
                if(operacion.equals("OR")){
                    System.out.println("resultado:");
                    System.out.println( valor1 || valor2);
                }
                else if(operacion.equals("AND")){
                    System.out.println("resultado:");
                    System.out.println( valor1 && valor2);
                }
                else if(operacion.equals("XOR")){
                    System.out.println("resultado:");
                    System.out.println( valor1 ^ valor2);
                }
                i+=1;
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e );
        }
    }
    
}
