package numeros_ascendentes;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Numeros_Ascendentes {
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[]  = new int[5];
        for(int i=0; i<numeros.length; i++)
        {   
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "));
        }
        Arrays.sort(numeros);
        for(int i = 0; i < numeros.length; i++)
        {
            JOptionPane.showMessageDialog(null,numeros[i]+" ");
        }
}}

