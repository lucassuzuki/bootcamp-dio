package collections.map.operacoesBasicas;

import collections.set.pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
         Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Lucas", 123456);
        agendaContatos.adicionarContato("Lucas", 0);
        agendaContatos.adicionarContato("Lucas Suzuki", 2222222);
        agendaContatos.adicionarContato("Lucas Java", 3333333);
        agendaContatos.adicionarContato("Joao joao", 4444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Lucas");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Lucas"));


    }
}
