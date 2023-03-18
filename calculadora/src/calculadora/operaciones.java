
package calculadora;


public class operaciones {
    public int numero1;
    public int numero2;
    public int numero3;
    public String operador;
    public void operaciones(int numero1,int numero2,int numero3, String operador){
        if (operador.equals("+")){
            System.out.println("resultado");
            System.out.println(numero1 + numero2 + numero3);
        }
        else if(operador.equals("-")){
            System.out.println("resultado");
            System.out.println(numero1 - numero2 - numero3);
        }
        else if (operador.equals("/")){
            System.out.println("resultado");
            System.out.println(numero1 / numero2 / numero3);
        }
        else if (operador.equals("*")){
            System.out.println("resultado");
            System.out.println( numero1 * numero2 * numero3);
        }
        else if (operador.equals("%")){
            System.out.println("resultado");
            System.out.println(numero1 % numero2 % numero3);
        }  
    }
}
