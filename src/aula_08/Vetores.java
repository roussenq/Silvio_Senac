
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
        System.out.println("N�meros gerados: ");        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= (int) (Math.random() * 100) + 1;
                        
           // numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "
             //                           + (i+1) + "° número: "));
            
        }
        //IMPRIMIR NUMEROS
        for (int i = 0; i < numeros.length; i++) {
           System.out.println((i+1) + "� N�mero: " + numeros[i]);
        }
        
        //NUMEROS PARES
        System.out.println("\nN�meros pares: ");
        int cont = 1;
        for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    System.out.println(cont + "� N�mero: " + numeros[i]);
                    cont++;
                }
        }
        
        //NUMEROS IMPARES
        System.out.println("\nN�meros �mpares: ");
        cont = 1;
        for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 != 0 ) {
                    System.out.println(cont + "� N�mero: " + numeros[i]);
                    cont++;
                }
        }
     
    }
    
} 
