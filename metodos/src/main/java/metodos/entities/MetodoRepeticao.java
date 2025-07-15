package metodos.entities;

import java.util.ArrayList;
import java.util.List;

public class MetodoRepeticao {

    List<String> lista = new ArrayList<>();


    public void contar(int numero) {
        int contar = 1;
        while (contar <= numero) {
            System.out.println("Valores: " + contar);
            contar++;
        }
    }

    public void facaenquanto(double valore) {
        double soma = 1;
        double resultadoSoma = 0.0;
        do {
            resultadoSoma = soma + valore;
            System.out.println("Valores somados : " + resultadoSoma);
            soma++;
        } while (soma <= valore);
    }

    public void adiciorNome(String nome){
        lista.add(nome);
    }

    public void imprimirLista(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("Primeiro nome " + (i + 1) + "º ");
            System.out.println(lista.get(i));
        }
    }

    public void mostrarMultiplique() {
        int y = 0;
        int x = 0;
        for (int i = 1; i<5; i++){
            y = i - 1;
            x = i * 10;
            System.out.print(i);
        }
        System.out.print( "\n" + x);
    }

}
