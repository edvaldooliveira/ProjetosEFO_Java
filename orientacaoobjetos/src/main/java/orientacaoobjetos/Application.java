package orientacaoobjetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import orientacaoobjetos.entities.Aluno;
import orientacaoobjetos.entities.Curso;

import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		Scanner sc = new Scanner(System.in);


		Curso c = new Curso();
		Aluno a = new Aluno();

		/*System.out.println("Escolha uma das opções:");
		System.out.println("[1] Adicionar aluno");
		System.out.println("[2] Listar alunos");
		System.out.println("[3] Sair");
		System.out.print("Opção: ");*/
		//int opcao = Integer.parseInt(sc.nextLine());

		c.funcionalidadeParaAluno(sc);



	}

}
