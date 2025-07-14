package metodos.application;

import metodos.entities.Agenda;
import metodos.entities.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Application {

	//Agenda, Pessoa
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Scanner entrada = new Scanner(System.in);
		char repetir = 's';
		Agenda ag = new Agenda();

		while (repetir == 's' || repetir == 'S') {
			System.out.print("Nome de entrada: ");
			String nome = entrada.nextLine();

			System.out.print("Idade de entrada: ");
			int idade = Integer.parseInt(entrada.nextLine()); // evita conflito de buffer

			ag.adicionarPessoa(new Pessoa(nome, idade));

			System.out.print("Deseja adicionar outra pessoa? (s/n): ");
			String resposta = entrada.nextLine();

			if (!resposta.isEmpty()) {
				repetir = resposta.charAt(0);
			} else {
				repetir = 'n'; // Se nada for digitado, encerra
			}
		}

		System.out.println("\nLista de nomes:");
		ag.listaNomes();

		entrada.close();
	}
}