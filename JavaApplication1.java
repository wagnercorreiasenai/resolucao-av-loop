package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String nome = "";
        int codCargo = 0;
        int codFuncionario = 0;
        int tempoServico = 0;
        double salario = 0;
        double novoSalario = 0;
        double percentualAumento = 0;
        String nomeCargo = "";
        String aux = "sim";

        while (!aux.equals("nao")) {

            //Inicia a lógica do programa
        System.out.println("Informe o nome:");
        nome = leia.next();

        System.out.println("Informe o salário atual:");
        salario = leia.nextDouble();

        System.out.println("Informe o tempo de serviço:");
        tempoServico = leia.nextInt();

        System.out.println("Informe o código do funcionário: ");
        codFuncionario = leia.nextInt();

        System.out.println("Informe o código do cargo do funcionário:");
        System.out.println("101 - Gerente | 102 - Engenhreiro | 103 - Técnico");
        codCargo = leia.nextInt();
            
            
            if (codCargo == 101) {
                nomeCargo = "Gerente";

                if (tempoServico <= 1) {
                    percentualAumento = 10;
                } else if (tempoServico <= 3) {
                    percentualAumento = 20;
                } else if (tempoServico > 3) {
                    percentualAumento = 25;
                }

            } else if (codCargo == 102) {
                nomeCargo = "Engenheiro";

                if (tempoServico <= 1) {
                    percentualAumento = 15;
                } else if (tempoServico <= 3) {
                    percentualAumento = 30;
                } else if (tempoServico > 3) {
                    percentualAumento = 35;
                }

            } else if (codCargo == 103) {
                nomeCargo = "Técnico";

                if (tempoServico <= 1) {
                    percentualAumento = 5;
                } else if (tempoServico <= 3) {
                    percentualAumento = 10;
                } else if (tempoServico > 3) {
                    percentualAumento = 15;
                }

            } else {
                
                nomeCargo = "(Cargo não cadastrado)";
                
                if (tempoServico >= 3) {
                    percentualAumento = 35;
                } else {
                    percentualAumento = 0;
                }

            }

            //Calcula o aumento
            novoSalario = (salario * percentualAumento) / 100;
            novoSalario = novoSalario + salario;

            //Imprime os resultados
            System.out.println("Funcionário: " + nome + " Cód.: " + codFuncionario);
            System.out.println("Cargo: " + nomeCargo + " | Cód.: " + codCargo);
            System.out.println("Salário antigo: " + salario);
            System.out.println("Reajuste: " + (novoSalario - salario));
            System.out.println("Novo salário: " + novoSalario);

            //Pergunta se deseja continuar
            System.out.println("Deseja fazer um novo cálculo ?");
            System.out.println("sim | não");
            aux = leia.next();

        }

    }

}
