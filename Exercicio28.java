package exercicio.pkg28;

import java.util.Scanner;

public class Exercicio28 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 28");
    System.out.println("Escreva um algoritmo para uma empresa que decide dar um reajuste\n"
            + "a seus 584 funcionários de acordo com os seguintes critérios:\n"
            + "a. 50% para aqueles que ganham menos do que três salários mínimos;\n"
            + "b. 20% para aqueles que ganham entre três até dez salários mínimos;\n"
            + "c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;\n"
            + "d. 10% para os demais funcionários.\n"
            + "Leia o nome do funcionário, seu salário e o valor do salário mínimo.\n"
            + "Calcule o seu novo salário reajustado. Escrever o nome do funcionário,\n"
            + "o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento;");
    System.out.println("----------------------------------");
    
    Scanner leitorSalarioMinimo = new Scanner(System.in);
    Scanner leitorNomeFuncionario = new Scanner(System.in);
    Scanner leitorSalarioFuncionario = new Scanner(System.in);
    Scanner leitorRespotaPergunta = new Scanner(System.in);
    
    String nomeFuncionario;
    float salarioFuncionario;
    float salarioFuncionarioComAumento;
    float aumentoSalario;
    
    char respostaPergunta;
    
    float totalAumentoSalarios = 0;
    float totalSalariosFuncionarios = 0;
    
    
    System.out.println("Digite o valor do salário mínimo: ");
    System.out.print("R$ ");
    float salarioMinimo = leitorSalarioMinimo.nextFloat();
    
    System.out.println("----------------------------------");
    
    do {
      
      System.out.println("Digite o nome do funcionário: ");
      nomeFuncionario = leitorNomeFuncionario.nextLine();
      
      System.out.println("Digite o salário do funcionário: ");
      System.out.print("R$ ");
      salarioFuncionario = leitorSalarioFuncionario.nextFloat();
      
      if(salarioFuncionario < (salarioMinimo * 3)){
        aumentoSalario = salarioFuncionario * 0.5f;
        salarioFuncionarioComAumento = salarioFuncionario + aumentoSalario;
        totalAumentoSalarios += aumentoSalario;
        totalSalariosFuncionarios += salarioFuncionarioComAumento;
      } else {
        if(salarioFuncionario < (salarioMinimo * 10)){
          aumentoSalario = salarioFuncionario * 0.2f;
          salarioFuncionarioComAumento = salarioFuncionario + aumentoSalario;
          totalAumentoSalarios += aumentoSalario;
          totalSalariosFuncionarios += salarioFuncionarioComAumento;
        } else {
          if(salarioFuncionario < (salarioMinimo * 20)){
            aumentoSalario = salarioFuncionario * 0.15f;
            salarioFuncionarioComAumento = salarioFuncionario + aumentoSalario;
            totalAumentoSalarios += aumentoSalario;
            totalSalariosFuncionarios += salarioFuncionarioComAumento;
          } else {
            aumentoSalario = salarioFuncionario * 0.1f;
            salarioFuncionarioComAumento = salarioFuncionario + aumentoSalario;
            totalAumentoSalarios += aumentoSalario;
            totalSalariosFuncionarios += salarioFuncionarioComAumento;
          }
        }
      }
      
      System.out.println("----------------------------------");
      
      System.out.println("Nome do funcionário: " + nomeFuncionario);
      System.out.printf("Valor do reajuste salarial: R$ %.2f", aumentoSalario);
      System.out.println();
      System.out.printf("Valor final do salário com o reajuste salarial: R$ %.2f", salarioFuncionarioComAumento);
      System.out.println();
      
      System.out.println("----------------------------------");
      
      do {
        System.out.println("Deseja cadastrar outro funcionário? S = Sim | N = Não ");
        respostaPergunta = leitorRespotaPergunta.next().charAt(0);
        
        if(respostaPergunta != 'S' && respostaPergunta != 's' && respostaPergunta != 'N' && respostaPergunta != 'n'){
          System.out.println("Resposta inválida.");  
        }
      } while(respostaPergunta != 'S' && respostaPergunta != 's' && respostaPergunta != 'N' && respostaPergunta != 'n');
      System.out.println("----------------------------------");
      
      
      
    } while (respostaPergunta != 'N' && respostaPergunta != 'n');
    
    
    System.out.printf("Valor total dos reajustes saláriais: R$ %.2f", totalAumentoSalarios);
    System.out.println();
    System.out.printf("Valor total dos salários: R$ %.2f", totalSalariosFuncionarios);
    System.out.println();
    
  }
  
}
