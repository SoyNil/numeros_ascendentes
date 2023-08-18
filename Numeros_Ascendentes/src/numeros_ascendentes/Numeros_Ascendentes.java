package numeros_ascendentes;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Numeros_Ascendentes {
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int[] numeros = new int[5];
        for(i=0; i<numeros.length; i++)
        {   
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        }
        for(i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
}}

