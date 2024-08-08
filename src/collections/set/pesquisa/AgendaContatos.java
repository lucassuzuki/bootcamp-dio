package collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;
    private String nome;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Lucas", 123456);
        agendaContatos.adicionarContato("Lucas", 0);
        agendaContatos.adicionarContato("Lucas Suzuki", 2222222);
        agendaContatos.adicionarContato("Lucas Java", 3333333);
        agendaContatos.adicionarContato("Joao joao ", 4444444);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Lucas"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Lucas Suzuki", 3455654));

        agendaContatos.exibirContato();
    }
}
