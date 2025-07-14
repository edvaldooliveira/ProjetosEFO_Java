package metodos.entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Pessoa> listaPessoa = new ArrayList<>();

    public Agenda(){
    }

    public void adicionarPessoa(Pessoa p) {
        listaPessoa.add(p);
    }

    public void listaNomes(){
        for (Pessoa p : listaPessoa) {
            System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade());
        }
    }
}
