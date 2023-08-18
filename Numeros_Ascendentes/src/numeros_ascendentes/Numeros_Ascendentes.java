package numeros_ascendentes;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Numeros_Ascendentes {
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int[] numeros = new int[5];

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            numeros[i] = teclado.nextInt();
        }

        for(i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
    }}}

