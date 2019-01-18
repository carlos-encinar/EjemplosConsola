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
    
    private boolean palindromo(String cadena){
        //Primera fase: creo un nuevo string que sea una copia del
        //que me pasan pero quitándole los espacios en blanco
        String auxiliar ="";
        for(int i=0; i< cadena.length(); i++){
            //comillas simples significa que lo que este dentro es un char, es decir, un valor simple.
            //comillas dobles significa que lo que este dentro es un string, es decir, union de chars.
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        //ahora en auxiliar tengo el string pero sin espacios en blanco
        //declaro dos indices para que digan qué posiciones estoy comparando
        int indiceIzq= 0;
        int indiceDer= auxiliar.length()-1;
        
        //Mientras sean iguales los caracteres en esas posiciones la palabra sera un palíndromo
        //en el momento en el que una de esas comparaciones falle, es que no es un palíndromo.
        
        //además, si el indice izquierdo es mayor que el derecho, ya he chequeado toda la frase.
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        boolean resultado = true;
        if(indiceIzq < indiceDer){ // si esto se cumple es que la palabra no es un palíndromo.
            resultado = false;
            System.out.print(" NO ES UN PALÍNDROMO");
        }
        else{
            System.out.print(" SI ES UN PALÍNDROMO");
        }
        
        return resultado;
    }
    
    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros1)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
        
        System.out.println( ejercicios.palindromo("ACASO HUBO BUHOS ACA"));
    }
    
}
