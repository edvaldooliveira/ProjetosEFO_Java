package metodos.application;

import metodos.entities.Agenda;
import metodos.entities.MetodoRepeticao;
import metodos.entities.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MetodosListasFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*System.out.print("Informe o nome para lista:");
		String nome = sc.nextLine();

		MetodoRepeticao met = new MetodoRepeticao();

		met.adiciorNome(nome);

		met.imprimirLista();*/

		MetodoRepeticao mt = new MetodoRepeticao();
		mt.teste();







	}
}