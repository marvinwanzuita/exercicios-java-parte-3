package exercicio.pkg25;

import java.util.Scanner;

public class Exercicio25 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 25");
    System.out.println("Faça um algoritmo que leia dois números e identifique se\n"
            + "são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem\n"
            + "dizendo que eles são iguais. Caso sejam diferentes, informe qual número\n"
            + "é o maior, e uma mensagem que são diferentes;");
    System.out.println("----------------------------------");
    
    Scanner leitorNumero = new Scanner(System.in);
    
    System.out.println("Digite o primeiro número: ");
    int numero1 = leitorNumero.nextInt();
    
    System.out.println("Digite o segundo número: ");
    int numero2 = leitorNumero.nextInt();
    
    if(numero1 == numero2){
      System.out.println("Os dois números são iguais.");
    } else {
      if(numero1 > numero2){
        System.out.println("O primeiro número é maior que o segundo.");
      } else {
        System.out.println("O Segundo número é maior que o primeiro.");
      }
    }
    
    
    
  }
  
}
