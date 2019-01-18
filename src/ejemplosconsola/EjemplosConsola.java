    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjemplosConsola {
    
    int[] listaNumeros = {200,31,27,2,5,99};
    int[] listaNumeros1 = {-11,5,-34,7,5,209,33,77,7};
    int[] listaNumeros2 = {0,2000,-4,1581,5,999,777,9};
    /*
    El método maximos va a calcular el máximo y el segundo máximo de una lista de números
    */
    private int[] maximos (int[] lista){
        
        //declaramos un array de dos elementos para guardar el maximo y el segundo maximo.
        int [] listaMaximos = {lista[0], lista[1]};
         for(int i=0; i<lista.length; i++){
            
            if(listaMaximos[0] < lista[i]){
                //Si llega aquí, es que el número listaMaximos[0]
                //es menor que el numero de la lista con el que lo estoy comparando.
                //Una vez visto que el primer maximo es menor que el numero que estas comparando
                //el primer maximo pasa a ser el segundo maximo
               listaMaximos[1] = listaMaximos[0];
               //Y el primer maximo pasa a ser el numero que has comparado(el nuevo maximo).
               listaMaximos[0] = lista[i]; 
            }
            //Si llega aquí, es que el numero listaMaximos[0]
            //es mayor por lo tanto no se cumple la condicion y viene aqui.
            //Si el segundo maximo es menor que el numero comparado y ademas el maximo es distinto de este
            //entonces el segundo maximo pasa a ser ese numero que has comparado.
            else if(listaMaximos[1] < lista[i] && listaMaximos[0] != lista[i]){
                listaMaximos[1] = lista[i];
            }
            
        }
        return listaMaximos;
    }
    
    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros1)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
    }
    
}
