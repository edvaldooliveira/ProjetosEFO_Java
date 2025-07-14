package metodos.application;

import metodos.entities.Agenda;
import metodos.entities.AgendaAdicionarRemover;
import metodos.entities.Pessoa;

import java.util.Scanner;

public class ProgramaAdicionarRemover {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            AgendaAdicionarRemover ag = new AgendaAdicionarRemover();

            char continuar = 's';

            while (continuar == 's' || continuar == 'S') {
                System.out.print("\n[1] Adicionar pessoa\n[2] Remover pessoa\nEscolha uma opção: ");
                int opcao = Integer.parseInt(sc.nextLine());

                if (opcao == 1) {
                    System.out.print("Informe o nome da pessoa: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe a idade da pessoa: ");
                    int idade = Integer.parseInt(sc.nextLine());

                    ag.adicionarPessoa(new Pessoa(nome, idade));

                } else if (opcao == 2) {
                    System.out.print("Informe o nome da pessoa a remover: ");
                    String nomeRemover = sc.nextLine();

                    boolean removido = ag.removerPessoaPorNome(nomeRemover);
                    if (removido) {
                        System.out.println("Pessoa removida com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                }

                System.out.print("Deseja continuar? (s/n): ");
                String resposta = sc.nextLine();
                if (!resposta.isEmpty()) {
                    continuar = resposta.charAt(0);
                }
            }

            System.out.println("\nLista de pessoas:");
            ag.listarDetalhado();
            sc.close();
        }

}
