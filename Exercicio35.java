package exercicio35;

import java.util.Scanner;

public class Exercicio35 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 35");
    System.out.println("Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.\n"
            + "Sabe-se que o cálculo da conta de luz segue a tabela abaixo:\n"
            + "Tipo de Cliente Valor do KW/h\n"
            + "a. (Residência) 0,60;\n"
            + "b. (Comércio) 0,48;");
    System.out.println("----------------------------------");
    
    Scanner leitorTipoCliente = new Scanner(System.in);
    Scanner leitorQuantidadeKWh = new Scanner(System.in);
    
    float totalKWh;
    
    System.out.println("Digite a quantidade de KW/h do mês: ");
    int quantidadeKWh = leitorQuantidadeKWh.nextInt();
    
    System.out.println("Digite o tipo de cliente:\n"
            + "1 = Residência\n"
            + "2 = Comércio\n"
            + "3 = Indústria ");
    int tipoCliente = leitorTipoCliente.nextInt();
    
    System.out.println("----------------------------------");
    
    if((tipoCliente == 1) || (tipoCliente == 2) || (tipoCliente == 3)){
      if(tipoCliente == 1){
        totalKWh = quantidadeKWh * 0.60f;
        System.out.println("Valor total a pagar do cliente tipo Residência: ");
        System.out.printf("R$ %.2f", totalKWh);
        System.out.println();
      } else {
        if(tipoCliente == 2){
          totalKWh = quantidadeKWh * 0.48f;
          System.out.println("Valor total a pagar do cliente tipo Comércio: ");
          System.out.printf("R$ %.2f", totalKWh);
          System.out.println();
        } else {
          totalKWh = quantidadeKWh * 1.29f;
          System.out.println("Valor total a pagar do cliente tipo Indústria: ");
          System.out.printf("R$ %.2f", totalKWh);
          System.out.println();
        }
      }
    } else {
      System.out.println("Tipo de cliente inválido.");
    }
  }
  
}
