package metodos.application;

import metodos.entities.MetodoRepeticao;

import java.util.Scanner;

public class ProgramaMetodoRepeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MetodoRepeticao repete = new MetodoRepeticao();
        System.out.print("informe o valor para ser somado: ");
        double valore = sc.nextInt();

        repete.facaenquanto(valore);




    }
}
