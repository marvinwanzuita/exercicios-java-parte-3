package exercicios.pkg32;

import java.util.Scanner;

public class Exercicios32 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 32");
    System.out.println("Escreva um algoritmo que leia três valores inteiros e verifique\n"
            + "se eles podem ser os lados de um triângulo. Se forem, informar qual o tipo\n"
            + "de triângulo que eles formam: equilátero, isóscele ou escaleno. Propriedade:\n"
            + "o comprimento de cada lado de um triângulo é menor do que a soma dos\n"
            + "comprimentos dos outros dois lados.\n"
            + "a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;\n" +
              "b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.\n" +
              "c. Triângulo equilátero é também isóscele;\n" +
              "d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;");
    System.out.println("----------------------------------");
    
    Scanner leitorLadoA = new Scanner(System.in);
    Scanner leitorLaboB = new Scanner(System.in);
    Scanner leitorLaboC = new Scanner(System.in);
    
    System.out.println("Digite o tamanho do lado A: ");
    int ladoA = leitorLadoA.nextInt();
    
    System.out.println("Digite o tamanho do lado B: ");
    int ladoB = leitorLaboB.nextInt();
    
    System.out.println("Digite o tamanho do lado C: ");
    int ladoC = leitorLaboC.nextInt();
    
    System.out.println("----------------------------------");
    
    if ( ((ladoA + ladoB) > ladoC) && ((ladoB + ladoC) > ladoA) && ((ladoA + ladoC) > ladoB) ){
      if((ladoA == ladoB) && (ladoB == ladoC) && (ladoA == ladoC)){
        System.out.println("Triângulo Equilátero.");
      } else {
        if((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)){
          System.out.println("Triângulo Isóscele.");
        } else {
          System.out.println("Triângulo Escaleno.");
        }
      }
    } else {
      System.out.println("Não pode ser um triângulo.");
    }
    
    System.out.println("----------------------------------");
    
  }
  
}
