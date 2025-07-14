package metodos.entities;

public class Pessoa {

    private String nome;
    private Integer idade;


    Pessoa(){
    }

   public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
   }

   public String getNome(){
        return nome;
   }

   public void setNome(String nome){
        this.nome = nome;
   }

   public Integer getIdade(){
        return idade;
   }

   public void seIdade(){
        this.idade = idade;
   }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}


