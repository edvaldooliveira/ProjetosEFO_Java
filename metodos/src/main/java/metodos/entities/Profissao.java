package metodos.entities;

public class Profissao {
   /* private String Acompanhante;
    private String Acordeonista;
    private String Acrobata;
    private String Acupuntura;
    */



    //Meus metodos
    public Double salarioAcompanhante(Double taxa){
        System.out.println("Valor da Formação: " + taxa  );
        double resultadoTaxa = taxa * 0.1;
        double resulValorTaxa = resultadoTaxa + taxa;
            return resulValorTaxa;
    }

    public double somaValores(double valor1, double valor2, double valor3) {
        double resultadoValores = valor1 + valor2 + valor3;
        return resultadoValores;
    }

    public void listaNomes(String nome1, String nome2, String nome3) {
        String nomes = nome1 + nome2 + nome3;
        System.out.println("nomes: " + nome1 + " " + nome2 + " " + nome3);
    }





}
