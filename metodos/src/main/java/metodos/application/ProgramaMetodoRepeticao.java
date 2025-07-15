package metodos.application;

import metodos.entities.MetodoRepeticao;

import java.util.Scanner;

public class ProgramaMetodoRepeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MetodoRepeticao mt = new MetodoRepeticao();

        System.out.print("Informe o valor: ");
        int numero = sc.nextInt();

        mt.contar(numero);






    }
}
