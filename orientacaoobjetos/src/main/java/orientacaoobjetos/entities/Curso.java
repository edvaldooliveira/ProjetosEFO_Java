package orientacaoobjetos.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    private String nomeCurso;
    private Integer cargaHoraria;

    private List<Aluno> listaDeAluno = new ArrayList<>();

    public Curso() {
    }

    public Curso(String nomeCurso, Integer cargaHoraria) {
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
    }

    public void adicionarAlunos(Aluno aluno){
        listaDeAluno.add(aluno);
    }

    public void imprimirListaDeAluno() {
        for (Aluno aluno : listaDeAluno){
            System.out.println(
                  "Nome do Aluno: "   + aluno.getNome() + "\n" +
                  "Idade do Aluno: " + aluno.getIdade() + "\n" +
                  "Matrícula do Aluno: " + aluno.getMatricula() + "\n"
                    +"----------------------------------"
            );
        }
    }

    public void funcionalidadeParaAluno(Scanner sc) {
        char escolha = 's';

        while (escolha == 's' || escolha == 'S') {

            System.out.print("\nEscolha uma opção:\n [1] Adicionar \n [2] Listar: ");
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do Aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe a idade do Aluno: ");
                    int idade = Integer.parseInt(sc.nextLine());

                    System.out.print("Informe a matrícula do Aluno: ");
                    String matricula = sc.nextLine();

                    adicionarAlunos(new Aluno(nome, idade, matricula));
                    break;

                case 2:
                    imprimirListaDeAluno();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.print("\nDeseja continuar? (S/N): ");
            escolha = sc.next().charAt(0);
            sc.nextLine(); // limpa o buffer do Enter
        }
    }
}
