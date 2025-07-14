package metodos.entities;

public class Metodos {
    public int somar(int a, int b) {
        int result = a + b;
        return result;
    }

    public boolean ehPar(int numero) {
        boolean resultPar = numero % 2 == 0;
        return resultPar;
    }

    public void saudacao(String nome) {
        System.out.println("Ola: " + nome + "!");
    }

    public int fatorial(int n) {
        int valor = 1;
        for (int i = 2; i <= n; i++) {
            System.out.println(i);
            valor *= i;
        }
        return valor;
    }

    public boolean ehPalindromo(String palavra) {
        System.out.println(palavra);
        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println(invertida);
        return palavra.equalsIgnoreCase(invertida);

    }

    public void tubuada(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.println(numero + " x " + i + " = " + ( numero * i ));
        }
    }

        public double media(double[] notas) {
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            return soma / notas.length;
        }

        public int somaTudo(int ... numeros){
        int soma = 0;
            for (int n : numeros) {
                soma += n;
            }
            return soma;
        }


        public int contarVogais(String frase){
        int contagem = 0;

            frase = frase.toLowerCase();
            for (char c : frase.toCharArray()) {
                if ("aieou".indexOf(c) != -1) {
                    contagem ++;
                }
            }
            return contagem;
        }


        public String clasificarIMC(double imc){
            if (imc < 18.5) return "Abaixo do peso";
            if (imc < 25.0) return "Peso normal";
            return "Acima do peso";
        }



        public String recebePessoa(Pessoa p){

            return "Nome: " + p.getNome() + ", Idade: " + p.getIdade();
        }


}

