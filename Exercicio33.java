package exercicio33;

import java.util.Scanner;

public class Exercicio33 {

  public static void main(String[] args) {
    System.out.println("EXERCÍCIO 33");
    System.out.println("A escola 'APRENDER' faz o pagamento de seus professores por hora/aula.\n"
            + "Faça um algoritmo que calcule e exiba o salário de um professor. Sabe-se que o valor\n"
            + "hora/aula segue a tabela abaixo:\n"
            + "a. Professor nível 1 = R$ 12,00 por hora/aula;\n"
            + "b. Professor nível 2 = R$ 17,00 por hora/aula;\n"
            + "c. Professor nível 3 = R$ 25,00 por hora/aula;");
    System.out.println("----------------------------------");
    
    Scanner leitorNivelProfessor = new Scanner(System.in);
    Scanner leitorTotalHoras = new Scanner(System.in);
    
    float valorTotalHorasTrabalhadas = 0;
    
    boolean erroDigito = false;
    
    System.out.println("Digite o código do nível do professor:\n"
            + "1 = Nível 1\n"
            + "2 = Nível 2\n"
            + "3 = Nível 3 ");
    int nivelProfessor = leitorNivelProfessor.nextInt();
    
    System.out.println("Digite o total de horas trabalhadas no mês do professor: ");
    int horasTotaisTrabalhadas = leitorTotalHoras.nextInt();
    
    switch(nivelProfessor){
      case 1:
        valorTotalHorasTrabalhadas = horasTotaisTrabalhadas * 12;
        break;
      case 2:
        valorTotalHorasTrabalhadas = horasTotaisTrabalhadas * 17;
        break;
      case 3:
        valorTotalHorasTrabalhadas = horasTotaisTrabalhadas * 25;
        break;
      default:
        erroDigito = true;
    }
    
    System.out.println("----------------------------------");
    
    if(erroDigito == true){
      System.out.println("Código do nível do professor não encontrado.");
    } else{
      System.out.printf("Valor total do professor Nível " + nivelProfessor + ": R$ %.2f", valorTotalHorasTrabalhadas);
      System.out.println();
    }
    
    
  }
  
}


