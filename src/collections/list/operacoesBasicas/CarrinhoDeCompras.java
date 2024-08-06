package collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> carrinhoParaRemover = new ArrayList<>();
        for (Item i : carrinhoList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                carrinhoParaRemover.add(i);
            }
        }

        carrinhoList.removeAll(carrinhoParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;

        for(Item i : carrinhoList){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println("Quantidade de itens no carrinho: " + carrinhoList.size());
        for (Item item : carrinhoList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoList = new CarrinhoDeCompras();

        carrinhoList.exibirItens();

        carrinhoList.adicionarItem("Feijao", 10.0, 2);
        carrinhoList.adicionarItem("Feijao", 10.0, 1);
        carrinhoList.adicionarItem("arroz", 20.0, 1);

        carrinhoList.exibirItens();

        carrinhoList.removerItem("arroz");

        carrinhoList.exibirItens();

        System.out.println("Valor total após remoção: " + carrinhoList.calcularValorTotal());
    }
}
