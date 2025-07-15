package metodos.entities;

public class MetodoRepeticao {


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
            soma ++;
        } while (soma <= valore);

    }
}
