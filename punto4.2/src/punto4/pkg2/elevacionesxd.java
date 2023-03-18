
package punto4.pkg2;


public class elevacionesxd {
    public long numero;
    public void elevar(long numero){
        if (String.valueOf(numero).length() == 10){
        double resultado = Math.pow(numero, 4);
            System.out.println(resultado);
        }
        else{
            System.out.println("el numero no cumple con los requerimientos");
        }
    }
}
