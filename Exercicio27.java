package exercicio.pkg27;

import java.util.Scanner;

public class Exercicio27 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 27");
    System.out.println("A concessionária de veículos “CARANGO” está vendendo os seus\n"
            + "veículos com desconto. Faça um algoritmo que calcule e exiba o valor\n"
            + "do desconto e o valor a ser pago pelo cliente. O desconto deverá ser\n"
            + "calculado sobre o valor do veículo de acordo com o combustível\n"
            + "(álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo\n"
            + "zero encerra entrada de dados. Informe total de desconto e total\n"
            + "pago pelos clientes;");
    System.out.println("----------------------------------");
    
    Scanner leitorValorVeiculo = new Scanner(System.in);
    Scanner leitorTipoCombustivel = new Scanner(System.in);
    Scanner leitor3 = new Scanner(System.in);
    
    float valorVeiculo;
    int tipoCombustivel;
    float valorVeiculoComDesconto =0;
    float valorDoDesconto = 0;
    char respostaPergunta;
    
    float valorTotalDesconto = 0;
    float valorTotalVeiculo = 0;
    
    do{
      
      System.out.println("Digite o valor do veículo: ");
      System.out.print("R$ ");
      valorVeiculo = leitorValorVeiculo.nextFloat();
      
      do {
        System.out.println("Digite o tipo do combustível:\n"
               + "1 = Álcool\n"
               + "2 = Gasolina\n"
               + "3 = Diesel"); 
        tipoCombustivel = leitorTipoCombustivel.nextInt();
      
        
        switch(tipoCombustivel){
          case 1:
            valorDoDesconto = valorVeiculo * 0.25f;
            valorVeiculoComDesconto = valorVeiculo - valorDoDesconto;
            valorTotalDesconto += valorDoDesconto;
            valorTotalVeiculo += valorVeiculoComDesconto;
            break;
          case 2:
            valorDoDesconto = valorVeiculo * 0.21f;
            valorVeiculoComDesconto = valorVeiculo - valorDoDesconto;
            valorTotalDesconto += valorDoDesconto;
            valorTotalVeiculo += valorVeiculoComDesconto;
            break;
          case 3:
            valorDoDesconto = valorVeiculo * 0.14f;
            valorVeiculoComDesconto = valorVeiculo - valorDoDesconto;
            valorTotalDesconto += valorDoDesconto;
            valorTotalVeiculo += valorVeiculoComDesconto;
            break;
         default:
            System.out.println("Tipo do combustivel incorreto.");
         }
        
      } while (tipoCombustivel != 1 && tipoCombustivel != 2 && tipoCombustivel != 3);
      
      System.out.printf("Valor do desconto: R$ %.2f", valorDoDesconto);
      System.out.println();
      System.out.printf("Valor do veículo com desconto: R$ %.2f", valorVeiculoComDesconto);
      System.out.println();
      System.out.println("----------------------------------");
      
      do {
        System.out.println("Deseja calcular outro veículo? S = Sim | N = Não ");
        respostaPergunta = leitor3.next().charAt(0);
        
        if(respostaPergunta != 'S' && respostaPergunta != 's' && respostaPergunta != 'N' && respostaPergunta != 'n'){
          System.out.println("Resposta inválida.");  
        }
      } while(respostaPergunta != 'S' && respostaPergunta != 's' && respostaPergunta != 'N' && respostaPergunta != 'n');
      System.out.println("----------------------------------");
      
    } while (respostaPergunta != 'N' && respostaPergunta != 'n');
    
    System.out.printf("Valor total do desconto: R$ %.2f", valorTotalDesconto);
    System.out.println();
    System.out.printf("Valor total dos veículos: R$ %.2f", valorTotalVeiculo);
    System.out.println();
    
  }
  
}
