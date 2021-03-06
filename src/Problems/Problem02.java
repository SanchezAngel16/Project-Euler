/* Project Euler - Problem 2 (Even Fibonacci numbers)
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 * 
 * Cada nuevo término en la secuencia de Fibonacci se genera al sumas los dos términos anteriores. 
 * Al comenzar con 1 y 2, los primeros 10 términos serán: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * Al considerar los términos en la secuencia de Fibonacci cuyos valores no exceden los cuatro millones, 
 * encuentre la suma de los términos pares.
 * 
 */

package Problems;

/* @author Ángel Sánchez */
public class Problem02 {
    
    public static void main(String[] args){
        long suma = 0;
        long anterior = 1;
        long siguiente = 1;
        long auxiliar;
        
        long startTime = System.nanoTime();
        
        for(long i = 0; siguiente < 4000000; i++){
            auxiliar = siguiente;
            siguiente += anterior;
            anterior = auxiliar;
            if(siguiente % 2 == 0){
                suma += siguiente;
            }
        }
        System.out.println("La suma es: " + suma);
        
        long endTime = System.nanoTime();
        
        System.out.println("Duracion: " + (endTime - startTime)/1e6 + " ms");
    }
}
