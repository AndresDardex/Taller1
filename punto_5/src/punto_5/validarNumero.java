
package punto_5;


public class validarNumero {
    private double numero;
    public double validar(double numero){
        double resultado = 0;
        if (numero >= 15.12 && numero <= 19.31){
            resultado = ((numero*100)/2)+ 100;
            System.out.println(resultado);
        }
        else{
            System.out.println("el numero "+ numero+" no cumple con los requerimientos");
        }
        return resultado;
    }
}
