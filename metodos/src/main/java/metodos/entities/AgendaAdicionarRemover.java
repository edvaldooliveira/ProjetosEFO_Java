package metodos.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaAdicionarRemover {
    private List<Pessoa> lista = new ArrayList<>();

    public void adicionarPessoa(Pessoa p) {
        lista.add(p);
    }

    public boolean removerPessoaPorNome(String nome) {
        Iterator<Pessoa> it = lista.iterator();
        while (it.hasNext()) {
            Pessoa p = it.next();
            if (p.getNome().equalsIgnoreCase(nome)) {
                it.remove();
                return true;
            }
        }
        return false;
    }



    public void listarDetalhado() {
        for (Pessoa p : lista) {
            System.out.println(p.getNome() + " - " + p.getIdade() + " anos");
        }
    }

    public void listaNomes() {
        for (Pessoa p : lista) {
            System.out.println("- " + p.getNome());
        }
    }
}
