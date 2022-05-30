package exercicio.pkg29;

import java.util.Scanner;

public class Exercicio29 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 29");
    System.out.println("Faça um algoritmo que receba o número do mês e mostre o mês\n"
            + "correspondente. Valide mês inválido;");
    System.out.println("----------------------------------");
    
    Scanner leitorMes = new Scanner(System.in);
    
    System.out.println("Digite o nome do funcionário: ");
    int mes = leitorMes.nextInt();
    
    switch(mes){
      case 1:
        System.out.println("Janeiro");
        break;
      case 2:
         System.out.println("Fevereiro");
         break;
      case 3:
         System.out.println("Março");
         break; 
      case 4:
         System.out.println("Abril");
         break; 
      case 5:
         System.out.println("Maio");
         break;
      case 6:
         System.out.println("Junho");
         break;
      case 7:
         System.out.println("Julho");
         break;
      case 8:
         System.out.println("Agosto");
         break;
      case 9:
         System.out.println("Setembro");
         break;
      case 10:
         System.out.println("Outubro");
         break;
      case 11:
         System.out.println("Novembro");
         break;
      case 12:
         System.out.println("Novembro");
         break;
      default:
        System.out.println("Mês inválido.");
    }
  }
  
}
