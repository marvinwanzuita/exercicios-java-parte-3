package exercicio31;

import java.util.Scanner;

public class Exercicio31 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 31");
    System.out.println("Dados três valores A, B e C, em que A e B são números reais\n"
            + "e C é um caractere, pede-se para imprimir o resultado da operação de A por\n"
            + "B se C for um símbolo de operador aritmético; caso contrário deve ser impressa\n"
            + "uma mensagem de operador não definido. Tratar erro de divisão por zero;;");
    System.out.println("----------------------------------");
    
    Scanner leitorNumeroA = new Scanner(System.in);
    Scanner leitorNumeroB = new Scanner(System.in);
    Scanner leitorCaractereC = new Scanner(System.in);
    
    float resultadoOperacao = 0;
    String mensagemOperadorNaoDefinido = "10";
    
    System.out.println("Digite o valor de A: ");
    int numeroA = leitorNumeroA.nextInt();
    
    System.out.println("Digite o valor de B: ");
    int numeroB = leitorNumeroB.nextInt();
    
    System.out.println("----------------------------------");
    
    System.out.println("Digite o símbolo da operação que deseja executar:\n"
            + "A (operador) B\n"
            + "+ = Adição\n"
            + "- = Subtração\n"
            + "x = Multiplicação\n"
            + "/ = Divisão");
    char simboloOperacao = leitorCaractereC.next().charAt(0);
    
    switch(simboloOperacao){
      case '+':
        resultadoOperacao = numeroA + numeroB;
        break;
      case '-':
        resultadoOperacao = numeroA - numeroB;
        break;
      case 'x':
        resultadoOperacao = numeroA * numeroB;
        break;
      case '/':
        if(numeroB == 0){
          resultadoOperacao = numeroA / 1;
        } else {
          resultadoOperacao = numeroA / numeroB;
        }
        break;
      default:
        mensagemOperadorNaoDefinido = "Símbolo do operador não definido.";
    }
    
    if ((simboloOperacao == '/') && (numeroB == 0)){
      System.out.println("----------------------------------");
      System.out.println("Não é possível dividir por 0");
    } else {
        if ((simboloOperacao == '+') || (simboloOperacao == '-') || (simboloOperacao == 'x') || (simboloOperacao == '/')){
        System.out.println("----------------------------------");
        System.out.printf("Resultado da operação: %.2f", resultadoOperacao);
        System.out.println();
        System.out.println("----------------------------------");
      } else {
        System.out.println("----------------------------------");
        System.out.println(mensagemOperadorNaoDefinido);
        System.out.println("----------------------------------");
      }
    }
  }
  
}
