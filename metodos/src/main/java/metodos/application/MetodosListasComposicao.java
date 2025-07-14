package metodos.application;

import metodos.entities.Agenda;
import metodos.entities.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MetodosListasComposicao {

	//Agenda, Pessoa
	//while, if, else, isEmpty, charAt(0), !resposta, Integer.parseInt, char, ||, '', imprimir fora do laço.
	public static void main(String[] args) {
		SpringApplication.run(MetodosListasComposicao.class, args);

		Scanner sc = new Scanner(System.in);

		Agenda ag = new Agenda();

		char continuar = 's';

		while (continuar == 's' || continuar == 'S') {

			System.out.print("Informe o nome da pessoa: ");
			String nome = sc.nextLine();

			System.out.print("Informe a idade da pessoa: ");
			Integer idade = Integer.parseInt(sc.nextLine());

			ag.adicionarPessoa(new Pessoa(nome, idade));

			ag.removerPessoa(new Pessoa(nome, idade));

			System.out.print("Dejesa continuar : ('s/n')");
			String resposta = sc.nextLine();

			if (!resposta.isEmpty()) {
				continuar = resposta.charAt(0);
			}
		}

		System.out.println("Dados de pessoa\n: ");
		ag.listaNomes();
		sc.close();

	}
}