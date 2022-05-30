package exercicio.pkg26;

import java.util.Scanner;

public class Exercicio26 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 26");
    System.out.println("Faça um algoritmo que leia um número de 1 a 5 e escreva\n"
            + "por extenso. Caso o usuário digite um número que não esteja neste\n"
            + "intervalo, exibir a seguinte mensagem: número inválido;");
    System.out.println("----------------------------------");
    
    Scanner leitorNumero = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int numero = leitorNumero.nextInt();
    String numeroExtenso;
    
    switch (numero){
      case 1:
        numeroExtenso = "Um";
        break;
      case 2:
        numeroExtenso = "Dois";
        break;
      case 3:
        numeroExtenso = "Três";
        break;
      case 4:
        numeroExtenso = "Quatro";
        break;
      case 5:
        numeroExtenso = "Cinco";
        break;
      default:
        numeroExtenso = "Número inválido.";
    }
    
    System.out.println(numeroExtenso);
    
  }
  
}
