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
    
    private void palindromoV2(String cadena){
        
        String auxiliar ="";
        for(int i=0; i< cadena.length(); i++){
            
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        //Aqui ya tengo en el string auxiliar todas las letras
        //de la palabra original pero sin espacios en blanco
        
        int indiceIzq = 0;
        int indiceDer= auxiliar.length()-1;
        
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        boolean resultado = true;
        if(indiceIzq < indiceDer){ 
            System.out.print("La cadena " + cadena + "NO es un palindromo");
        }
        else{
            System.out.print("La cadena " + cadena + "SI es un palindromo");
        }
        
    }
    
    //OTRO EJERCICIO
    private boolean esIsograma (String palabra){

        for(int i=0; i< palabra.length()-1; i++){
            for (int j=i; j< palabra.length(); j++){
                if (palabra.charAt(i) == palabra.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    
    //Autor: María
    private void imprimeMes(int numx){
        if (numx >7){
            numx = 7;
        }
        int contador = 0;
        //pintara tantas xx como numX sea
    
        for (int j=1; j<numx; j++){
            System.out.print("XX ");
            contador = contador + 1;
        }
        for (int i=1; i<=31; i++){
            if (contador <=7){
                if (i<=9){
                    System.out.print("0" + i);
                    System.out.print(" ");
                }}
            if (i>9){
                System.out.print(i);
                System.out.print(" ");
            }
            contador = contador + 1;
        
            if(contador==7){
                System.out.println("");
                contador = 0;
            }
        }
        for(int x=contador; x<7; x++){
            System.out.print("XX ");
        }
        
    }
    
    private boolean esAnagrama (String palabraA, String palabraB){
        //pasamos a mayusculas todas las letras 
        palabraA = palabraA.toUpperCase();
        palabraB = palabraB.toUpperCase();
        
        boolean anagrama = false; //indica si las palabras son anagramas o no
        if(palabraA.length() == palabraB.length()){//solo empiezo a chequear si dos palabras tienen la misma longitud
            for (int i=0; i<palabraA.length(); i++){
                for (int j=0; j<palabraA.length(); j++){
                    
                }
            }
        }
    }

    
    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        
        /*
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros1)));
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
        
        //System.out.println( ejercicios.palindromo("ACASO HUBO BUHOS ACA"));
        //ejercicios.palindromoV2("ACASO HUBO BUHOS ACA");
        System.out.println( ejercicios.esIsograma("MURCIELAGOO"));
        */
        for (int i=7; i<14; i++){
            ejercicios.imprimeMes(i);
            System.out.println();
            System.out.println();
        }
    }
    
}
