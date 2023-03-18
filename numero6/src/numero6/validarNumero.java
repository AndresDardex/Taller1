
package numero6;


public class validarNumero {
    private int numero;
    public void Validar(int numero){
        if (numero >=74 && numero<= 189  ){
            if(numero % 5 == 0 && numero%2==0){
                System.out.println("numero "+numero+" validado");
            }
            else{
            System.out.println("el numero "+ numero + " no cumple con los requerimientos.");
        }
        
        }
        else{
            System.out.println("el numero "+ numero +" no cumple con los requerimientos.");
        }
    }
  
}
