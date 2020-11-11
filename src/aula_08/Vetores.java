
package aula_08;

//import javax.swing.JOptionPane;

/**
 *
 * @author david.maria
 */
public class Vetores {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        //GERAR NUMEROS
        System.out.println("Números gerados: ");        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= (int) (Math.random() * 100) + 1;
                        
           // numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "
             //                           + (i+1) + "Â° nÃºmero: "));
            
        }
        //IMPRIMIR NUMEROS
        for (int i = 0; i < numeros.length; i++) {
           System.out.println((i+1) + "° Número: " + numeros[i]);
        }
        
        //NUMEROS PARES
        System.out.println("\nNúmeros pares: ");
        int cont = 1;
        for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    System.out.println(cont + "° Número: " + numeros[i]);
                    cont++;
                }
        }
        
        //NUMEROS IMPARES
        System.out.println("\nNúmeros Ímpares: ");
        cont = 1;
        for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 != 0 ) {
                    System.out.println(cont + "° Número: " + numeros[i]);
                    cont++;
                }
        }
     
    }
    
} 
