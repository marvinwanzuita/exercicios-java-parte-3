package exercicio.pkg30;

import java.util.Scanner;

public class Exercicio30 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 30");
    System.out.println("Escreva um algoritmo que leia três valores inteiros distintos\n"
            + "e os escreva em ordem crescente;");
    System.out.println("----------------------------------");
    
    Scanner leitorNumero = new Scanner(System.in);

    int numeros[] = new int[3];
    int aux;
    
    for(int i = 0; i < numeros.length; i++){
      System.out.println("Digite o " + (i + 1) + "º número: ");
      numeros[i] = leitorNumero.nextInt();   
    }
    
    for(int i = 0; i < numeros.length; i++){
      for(int j = i + 1; j < numeros.length; j++){
        if(numeros[i] > numeros[j]){
          aux = numeros[j];
          numeros[j] = numeros[i];
          numeros[i] = aux;
        }
      }
    }
   
    System.out.println("----------------------------------");
    System.out.println("Números em ordem crescente: " + numeros[0] + " | " + numeros[1] + " | " + numeros[2]);
  }
  
}
