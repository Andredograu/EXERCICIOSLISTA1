/*Algoritmo para conversão
 * André Luis de Oliveira
 * 08/05/2023
 */
import java.util.Scanner;
public class excr3 {
    public static void main(String args[]) {
    Scanner texto = new Scanner(System.in);
    double n1;
    double n2;
    System.out.println("digite o valor desejado para conversão: ");
    n1 = texto.nextDouble();
    n2 = n1 * 4.95;
    System.out.println("resultado deu: " + n2);
    
    texto.close();
    }
}